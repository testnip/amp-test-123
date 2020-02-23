package nz.co.amp.automation.external;

import cucumber.api.Scenario;

public interface ExternalClient {
  void updateSession(Scenario scenario);
}
