package unitTest;

import helpers.JsonAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonTest {

    @Test
    public void areEquals() throws Exception {
        String actual="{\n" +
                "    \"Id\": 3982198,\n" +
                "    \"Content\": \"EynarRestAssured\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 4,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"ParentId\": null,\n" +
                "    \"Collapsed\": false,\n" +
                "    \"ItemOrder\": 149,\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"/Date(1646219490508)/\",\n" +
                "    \"LastUpdatedDate\": \"/Date(1646219490493)/\",\n" +
                "    \"Deleted\": false,\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}";
        String expected="{\n" +
                "    \"Id\": 3982178,\n" +
                "    \"Content\": \"EynarRestAssured\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 5,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"ParentId\": null,\n" +
                "    \"Collapsed\": false,\n" +
                "    \"ItemOrder\": \"IGNORE\",\n" +
                "    \"Children\": [\n" +
                "        \n" +
                "    ],\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"IGNORE\",\n" +
                "    \"LastUpdatedDate\": \"IGNORE\",\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}\n";
        JsonAssert.areEqualJson(expected,actual,"este es mi error msg ");

    }


    @Test
    public void areEquals2() throws Exception {
        String actual="{\n" +
                "    \"Id\": 3982198,\n" +
                "    \"Content\": \"EynarRestAssured\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 4,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"ParentId\": null,\n" +
                "    \"Collapsed\": false,\n" +
                "    \"ItemOrder\": 149,\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"/Date(1646219490508)/\",\n" +
                "    \"LastUpdatedDate\": \"/Date(1646219490493)/\",\n" +
                "    \"Deleted\": false,\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}";
        String expected="{\n" +
                "    \"Id\": 3982178,\n" +
                "    \"Content\": \"EynarRestAssured\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 5,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"ParentId\": null,\n" +
                "    \"Collapsed\": false,\n" +
                "    \"ItemOrder\": \"IGNORE\",\n" +
                "    \"Children\": [\n" +
                "        \n" +
                "    ],\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"IGNORE\",\n" +
                "    \"LastUpdatedDate\": \"IGNORE\",\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}\n";
        JsonAssert.areEqualJson(actual,expected,"este es mi error msg ");

    }

}
