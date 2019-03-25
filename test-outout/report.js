$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Jyothiaddala/Documents/JavaTraining/VWFSTask/src/main/java/Features/Vehicle.Feature");
formatter.feature({
  "line": 1,
  "name": "VWFS Feature",
  "description": "",
  "id": "vwfs-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Check the vehicle Registration",
  "description": "",
  "id": "vwfs-feature;check-the-vehicle-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters vehicle Registration number",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks Find Vehicle",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user should see the result",
  "keyword": "Then "
});
formatter.match({
  "location": "Findvehicle.user_opens_the_Browser()"
});
formatter.result({
  "duration": 2456207456,
  "status": "passed"
});
formatter.match({
  "location": "Findvehicle.user_enters_URL()"
});
formatter.result({
  "duration": 1051233734,
  "status": "passed"
});
formatter.match({
  "location": "Findvehicle.user_enters_vehicle_Registration_number()"
});
formatter.result({
  "duration": 119542929,
  "status": "passed"
});
formatter.match({
  "location": "Findvehicle.user_clicks_Find_Vehicle()"
});
formatter.result({
  "duration": 3066926325,
  "status": "passed"
});
formatter.match({
  "location": "Findvehicle.user_should_see_the_result()"
});
formatter.result({
  "duration": 142662949,
  "status": "passed"
});
});