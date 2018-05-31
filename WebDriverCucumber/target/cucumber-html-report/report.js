$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search With Valid Data",
  "description": "",
  "id": "search;search-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am in the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the search term in search box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchLoginDef.i_am_in_the_Home_Page()"
});
formatter.result({
  "duration": 12853590370,
  "status": "passed"
});
formatter.match({
  "location": "SearchLoginDef.i_enter_the_search_term_in_search_box()"
});
formatter.result({
  "duration": 199180957,
  "status": "passed"
});
formatter.match({
  "location": "SearchLoginDef.i_click_the_search_button()"
});
formatter.result({
  "duration": 3096558325,
  "status": "passed"
});
formatter.match({
  "location": "SearchLoginDef.i_should_see_the_search_results()"
});
formatter.result({
  "duration": 57318659,
  "status": "passed"
});
});