package Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.serenitybdd.junit5.SerenityTest;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.given;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SerenityTest
public class dgbsd {


    @BeforeAll
    public static void init() {
        baseURI = "https://as-cdt-dev-logistyx-qa1-docs.azurewebsites.net";
    }

    @Test
    public void test2() {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        String date2 = dateFormat.format(date);
        String month1 = date2.substring(0, 2);
        String day1 = date2.substring(3, 5);
       int year1 = Integer.parseInt(date2.substring(6, 10));
       int century1 = (year1 / 100) + 1;
       int hour1 = Integer.parseInt(date2.substring(11, 13)) + 5;
        String minute1 = date2.substring(14, 16);
        String second1 = date2.substring(17, 19);



        String currentDateTime1 = year1 + "-" + month1 + "-" + day1 + "T" + hour1 + ":" + minute1 + ":" + second1 + "Z";

       String requestJsonBodyShipments1 = "{\n" +
                "    \"ProjectCode\": null,\n" +
                "    \"ShippingFlowCode\": \"OUTBOUND\",\n" +
                "    \"ForwarderDivisionCode\": \"SFT\",\n" +
                "    \"ForwarderServiceCode\": \"STANDARD\",\n" +
                "    \"ShipperRef\": \"4706850\",\n" +
                "    \"ReceiverRef\": \"RR123456\",\n" +
                "    \"Addresses\": [\n" +
                "        {\n" +
                "            \"Reference\": \"FLE >><<01105\",\n" +
                "            \"AddressLines\": [\n" +
                "                {\n" +
                "                    \"Index\": 1,\n" +
                "                    \"Value\": \"Weena 10017 TEST\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Index\": 2,\n" +
                "                    \"Value\": \"Delivery address two\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PostalCode\": \"0001001\",\n" +
                "            \"LocalityName\": \"VITORIA\",\n" +
                "            \"CountryCode\": \"CH\",\n" +
                "            \"Description\": \"Desc><ription\",\n" +
                "            \"Contacts\": [\n" +
                "                {\n" +
                "                    \"Name\": \"Delivery Co<<ntact Name 1\",\n" +
                "                    \"EmailAddress\": \"vaiser@hotmail.com\",\n" +
                "                    \"PhoneNumber\": \"(31)497-532-323\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"AddressTypes\": [\n" +
                "                {\n" +
                "                    \"AddressTypeCode\": \"DELIVERY\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"Reference\": \"PUREF0001\",\n" +
                "            \"AddressLines\": [\n" +
                "                {\n" +
                "                    \"Index\": 1,\n" +
                "                    \"Value\": \"De Grens 27 TEST\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PostalCode\": \"5921CC\",\n" +
                "            \"LocalityName\": \"Heijen\",\n" +
                "            \"CountryCode\": \"ES\",\n" +
                "            \"Remark\": \"Remark value\",\n" +
                "            \"Contacts\": [\n" +
                "                {\n" +
                "                    \"Name\": \"Pickup Name One\",\n" +
                "                    \"EmailAddress\": \"vaiser@hotmail.com\",\n" +
                "                    \"PhoneNumber\": \"31497532323\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"VatNumber\": \"FR33452645948\",\n" +
                "            \"AddressTypes\": [\n" +
                "                {\n" +
                "                    \"AddressTypeCode\": \"PICKUP\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Value\": 200,\n" +
                "    \"ValueCurrencyCode\": \"USD\",\n" +
                "    \"NonDutiable\": false,\n" +
                "    \"IncotermCode\": \"CPT\",\n" +
                "    \"Weight\": 18.18,\n" +
                "    \"WeightUnitOfMeasure\": \"KGM\",\n" +
                "    \"RequestedPickupDateTime\": \"" +currentDateTime1+"\",\n" +
               "    \"RequestedPickupWindowBeginDateTime\": \"2022-02-14T21:16:17.565Z\",\n" +
               "    \"RequestedPickupWindowEndDateTime\": \"2022-02-14T21:16:17.565Z\",\n" +
               "    \"RequestedDeliveryDateTime\": \"2022-02-17T21:16:17.565Z\",\n" +
               "    \"RequestedDeliveryWindowBeginDateTime\": \"2022-02-17T21:16:17.565Z\",\n" +
               "    \"RequestedDeliveryWindowEndDateTime\": \"2022-02-17T21:16:17.565Z\",\n" +
                "    \"ForwarderServiceIndicators\": {\n" +
                "        \"AdditionalServices\": [\n" +
                "            \"PICKUP_ROOF_LOAD\",\n" +
                "            \"PICKUP_HIAB\",\n" +
                "            \"PICKUP_SIDE_LOAD\",\n" +
                "            \"DELIVERY_ROOF_LOAD\"\n" +
                "        ]\n" +
                "    },\n" +
                "    \"ShippingUnits\": [\n" +
                "        {\n" +
                "            \"Index\": 1,\n" +
                "            \"ShipperRef\": \"4706850\",\n" +
                "            \"ReceiverRef\": \"3058986\",\n" +
                "            \"Value\": 1212,\n" +
                "            \"ValueCurrencyCode\": \"EUR\",\n" +
                "            \"Length\": 37,\n" +
                "            \"Width\": 26.5,\n" +
                "            \"Height\": 4,\n" +
                "            \"DimensionsUnitOfMeasure\": \"CM\",\n" +
                "            \"Volume\": 135200.36,\n" +
                "            \"VolumeUnitOfMeasure\": \"CMQ\",\n" +
                "            \"PackageType\": \"PB\",\n" +
                "            \"GrossWeight\": 12.13,\n" +
                "            \"GrossWeightUnitOfMeasure\": \"KG\",\n" +
                "            \"Content\": \"This is the description of the sUnit content value\",\n" +
                "            \"ShippingUnitItems\": [\n" +
                "                {\n" +
                "                    \"Description\": \"This <is <z<>the description\",\n" +
                "                    \"ShipperRef\": \"00401000000000000017\",\n" +
                "                    \"CountryOfOrigin\": \"NL\",\n" +
                "                    \"HarmonisedSystemCode\": \"6604002011\",\n" +
                "                    \"Value\": 12.12,\n" +
                "                    \"ValueCurrencyCode\": \"EUR\",\n" +
                "                    \"Weight\": 12.13,\n" +
                "                    \"WeightUnitOfMeasure\": \"KG\",\n" +
                "                    \"Quantity\": 100,\n" +
                "                    \"QuantityUnitOfMeasure\": \"KG\",\n" +
                "                    \"DangerousGoods\": []\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"NumberOfShippingUnits\": 1\n" +
                "}";


        RestAssured.given().header("Shipper-Code", "VDL-NL")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestJsonBodyShipments1)
                .when().post("/shipments/label")
                .then()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);

    }
}
