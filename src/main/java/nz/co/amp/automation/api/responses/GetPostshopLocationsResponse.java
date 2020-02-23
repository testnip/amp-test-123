package nz.co.amp.automation.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import nz.co.amp.automation.domain.PostshopLocation;

import java.util.List;

public class GetPostshopLocationsResponse<T> {

  @JsonProperty("locations")
  private List<PostshopLocation> postshopLocations;

  public List<PostshopLocation> get() {
    return postshopLocations;
  }
}
