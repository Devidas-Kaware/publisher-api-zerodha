# Integration of zerodha publisher api

## Steps to start the project : 
1. Clone the repository and import the project publisher_api_zerodha.
2. Set the "api_key" in the publisher_api_zerodha/src/main/resources/templates/zerodhabuysell.html which is generated from Kite Connect developer account.(https://developers.kite.trade/)
3. Run the spring boot project.
4. Hit the curl request : "curl --location --request POST 'http://localhost:8080/buysell'"
5. Copy the response in the zerodha.html page and call that html page from browser.
6. Accept the popup request and login into zerodha account. You can buy the Stock which we passed in the project int the file publisher_api_zerodha/src/main/java/com/publisher/api/controller/BuySellZerodhaPublisherController.java