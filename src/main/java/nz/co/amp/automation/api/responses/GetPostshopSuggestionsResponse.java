package nz.co.amp.automation.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import nz.co.amp.automation.domain.PostShopSuggestions;

import java.util.List;

public class GetPostshopSuggestionsResponse<T> {

  @JsonProperty("suggestions")
  private List<PostShopSuggestions> postshopSuggestions;

  public List<PostShopSuggestions> get() {
    return postshopSuggestions;
  }
}
