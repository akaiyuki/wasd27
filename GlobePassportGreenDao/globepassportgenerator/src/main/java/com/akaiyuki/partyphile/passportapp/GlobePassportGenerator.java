package com.akaiyuki.partyphile.passportapp;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.ToMany;

public class GlobePassportGenerator {


    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(1, "com.akaiyuki.partyphile.passportapp.dao");



        /* PEvents */
        Entity PEvents = schema.addEntity("PEvents");
        PEvents.addIdProperty();
        PEvents.addStringProperty("name");
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
        PAppSettings.addIdProperty();
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







//        Entity person = schema.addEntity("Person");
//        person.addIdProperty();
//        person.addStringProperty("name");
//        person.addStringProperty("comment");
//
//        Entity lease = schema.addEntity("Lease");
//        lease.addIdProperty();
//        lease.addStringProperty("item");
//        lease.addStringProperty("comment");
//        lease.addLongProperty("leasedate");
//        lease.addLongProperty("returndate");

//        Property personId = lease.addLongProperty("personId").getProperty();
//        lease.addToOne(person, personId);
//
//        ToMany personToLease = person.addToMany(lease, personId);
//        personToLease.setName("leases");

        new DaoGenerator().generateAll(schema, "../app/src/main/java");
    }



}
