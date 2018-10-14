$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/google_search.feature");
formatter.feature({
  "name": "Google  Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "uno",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "precondiciones",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.precondiciones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hago",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.hago()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.valido()"
});
formatter.result({
  "status": "passed"
});
});