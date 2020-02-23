package nz.co.amp.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nz.co.amp.automation.api.ParcelAddressApiClientV1;
import nz.co.amp.automation.api.responses.GetParcelAddressResponse;
import nz.co.amp.automation.domain.Address;
import nz.co.amp.automation.domain.MapHolder;
import nz.co.amp.automation.domain.ParcelAddress;
import nz.co.amp.automation.io.ModelFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParcelAddressApiSteps {

  private final MapHolder mapHolder;
  private final ParcelAddressApiClientV1 parcelAddressApiClientV1;
  private final ModelFactory modelFactory;

  @Autowired
  public ParcelAddressApiSteps(MapHolder mapHolder, ParcelAddressApiClientV1 parcelAddressApiClientV1, ModelFactory modelFactory) {
    this.mapHolder = mapHolder;
    this.parcelAddressApiClientV1 = parcelAddressApiClientV1;
    this.modelFactory = modelFactory;
  }

  @When("^I call parcel address endpoint to validate suggestions$")
  public void iCallParcelAddressEndpointToValidateSuggestions() throws Throwable {
    Address address = mapHolder.get(Address.class);
    GetParcelAddressResponse<List<ParcelAddress>> getParcelAddressResponse = parcelAddressApiClientV1.get(address);
    mapHolder.put(GetParcelAddressResponse.class, getParcelAddressResponse);
  }

  @Then("^I should be shown list of suggestions$")
  public void iShouldBeShownListOfSuggestions() throws Throwable {
    Address address = mapHolder.get(Address.class);
    GetParcelAddressResponse expectedGetParcelAddressResponse = modelFactory.readFromJson(address.getValue(), GetParcelAddressResponse.class);
    GetParcelAddressResponse getParcelAddressResponse = mapHolder.get(GetParcelAddressResponse.class);
    getParcelAddressResponse.getData();
    getParcelAddressResponse.get();
    assertThat(getParcelAddressResponse.get()).isEqualTo(expectedGetParcelAddressResponse.get());
  }
}

