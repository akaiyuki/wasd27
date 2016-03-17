package com.akaiyuki.partyphile.passportapp;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.ToMany;

public class GlobePassportGenerator {

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(3, "com.akaiyuki.partyphile.passportapp.dao");

        addSchemas(schema);

        new DaoGenerator().generateAll(schema, "../globepassportgenerator/src/main/java");
    }


    public static void addSchemas(Schema schema) {


        /* PEvents */
        Entity PEvents = schema.addEntity("PEvents");
        PEvents = addOAsset(PEvents);
        PEvents.addStringProperty("Eventname");
        PEvents.addStringProperty("venue");
        PEvents.addStringProperty("event_datetime");
        PEvents.addStringProperty("booth_map_img");
        PEvents.addStringProperty("main_pic");
        PEvents.addStringProperty("banner_pic");
        PEvents.addStringProperty("cutoff_datetime");
        PEvents.addIntProperty("priority");
        PEvents.addStringProperty("keywords");
        PEvents.addIntProperty("is_featured");
        PEvents.addIntProperty("is_exclusive");
        PEvents.addIntProperty("max_attendees");
        PEvents.addIntProperty("attendees_count");
        PEvents.addDoubleProperty("longlitude");
        PEvents.addDoubleProperty("latitude");


        /* PAppSettings */
        Entity PAppSettings = schema.addEntity("PAppSettings");
        PAppSettings = addOAsset(PAppSettings);
        PAppSettings.addIntProperty("is_secure");
        PAppSettings.addStringProperty("adhoc_base_path");
        PAppSettings.addStringProperty("test_base_path");
        PAppSettings.addStringProperty("staging_base_path");
        PAppSettings.addStringProperty("prod_base_path");
        PAppSettings.addStringProperty("api_resource_path");
        PAppSettings.addIntProperty("active_path");
        PAppSettings.addIntProperty("is_app_active");
        PAppSettings.addIntProperty("is_app_needs_update");
        PAppSettings.addIntProperty("is_paypal_active");
        PAppSettings.addIntProperty("is_dragonpay_active");
        PAppSettings.addIntProperty("is_globelabs_active");
        PAppSettings.addIntProperty("will_force_close_when_cancelled_updates");
        PAppSettings.addIntProperty("allow_ads");
        PAppSettings.addStringProperty("event_main_pics_path");
        PAppSettings.addStringProperty("event_banner_pics_path");
        PAppSettings.addStringProperty("venue_main_pics_path");
        PAppSettings.addStringProperty("venue_banner_pics_path");
        PAppSettings.addStringProperty("booth_map_path");
        PAppSettings.addStringProperty("pass_pic_path");
        PAppSettings.addIntProperty("distance_threshold");
        PAppSettings.addStringProperty("cities");
        PAppSettings.addStringProperty("interstitial");

    }

    private static Entity addOAsset(Entity entity) {
        entity.addIdProperty().autoincrement().unique();
        entity.addBooleanProperty("archived");
        entity.addDateProperty("dateUpdated");
        entity.addIntProperty("groupOrder");
        entity.addStringProperty("name");
        entity.addIntProperty("sortOrder");
        entity.addStringProperty("tags");
        entity.addStringProperty("timeStamp");
        entity.addLongProperty("pid");
        return entity;
    }



}
