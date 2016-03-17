package com.akaiyuki.partyphile.passportapp.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "PAPP_SETTINGS".
 */
public class PAppSettings {

    private Long id;
    private Boolean archived;
    private java.util.Date dateUpdated;
    private Integer groupOrder;
    private String name;
    private Integer sortOrder;
    private String tags;
    private String timeStamp;
    private Long pid;
    private Integer is_secure;
    private String adhoc_base_path;
    private String test_base_path;
    private String staging_base_path;
    private String prod_base_path;
    private String api_resource_path;
    private Integer active_path;
    private Integer is_app_active;
    private Integer is_app_needs_update;
    private Integer is_paypal_active;
    private Integer is_dragonpay_active;
    private Integer is_globelabs_active;
    private Integer will_force_close_when_cancelled_updates;
    private Integer allow_ads;
    private String event_main_pics_path;
    private String event_banner_pics_path;
    private String venue_main_pics_path;
    private String venue_banner_pics_path;
    private String booth_map_path;
    private String pass_pic_path;
    private Integer distance_threshold;
    private String cities;
    private String interstitial;

    public PAppSettings() {
    }

    public PAppSettings(Long id) {
        this.id = id;
    }

    public PAppSettings(Long id, Boolean archived, java.util.Date dateUpdated, Integer groupOrder, String name, Integer sortOrder, String tags, String timeStamp, Long pid, Integer is_secure, String adhoc_base_path, String test_base_path, String staging_base_path, String prod_base_path, String api_resource_path, Integer active_path, Integer is_app_active, Integer is_app_needs_update, Integer is_paypal_active, Integer is_dragonpay_active, Integer is_globelabs_active, Integer will_force_close_when_cancelled_updates, Integer allow_ads, String event_main_pics_path, String event_banner_pics_path, String venue_main_pics_path, String venue_banner_pics_path, String booth_map_path, String pass_pic_path, Integer distance_threshold, String cities, String interstitial) {
        this.id = id;
        this.archived = archived;
        this.dateUpdated = dateUpdated;
        this.groupOrder = groupOrder;
        this.name = name;
        this.sortOrder = sortOrder;
        this.tags = tags;
        this.timeStamp = timeStamp;
        this.pid = pid;
        this.is_secure = is_secure;
        this.adhoc_base_path = adhoc_base_path;
        this.test_base_path = test_base_path;
        this.staging_base_path = staging_base_path;
        this.prod_base_path = prod_base_path;
        this.api_resource_path = api_resource_path;
        this.active_path = active_path;
        this.is_app_active = is_app_active;
        this.is_app_needs_update = is_app_needs_update;
        this.is_paypal_active = is_paypal_active;
        this.is_dragonpay_active = is_dragonpay_active;
        this.is_globelabs_active = is_globelabs_active;
        this.will_force_close_when_cancelled_updates = will_force_close_when_cancelled_updates;
        this.allow_ads = allow_ads;
        this.event_main_pics_path = event_main_pics_path;
        this.event_banner_pics_path = event_banner_pics_path;
        this.venue_main_pics_path = venue_main_pics_path;
        this.venue_banner_pics_path = venue_banner_pics_path;
        this.booth_map_path = booth_map_path;
        this.pass_pic_path = pass_pic_path;
        this.distance_threshold = distance_threshold;
        this.cities = cities;
        this.interstitial = interstitial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Integer getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(Integer groupOrder) {
        this.groupOrder = groupOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getIs_secure() {
        return is_secure;
    }

    public void setIs_secure(Integer is_secure) {
        this.is_secure = is_secure;
    }

    public String getAdhoc_base_path() {
        return adhoc_base_path;
    }

    public void setAdhoc_base_path(String adhoc_base_path) {
        this.adhoc_base_path = adhoc_base_path;
    }

    public String getTest_base_path() {
        return test_base_path;
    }

    public void setTest_base_path(String test_base_path) {
        this.test_base_path = test_base_path;
    }

    public String getStaging_base_path() {
        return staging_base_path;
    }

    public void setStaging_base_path(String staging_base_path) {
        this.staging_base_path = staging_base_path;
    }

    public String getProd_base_path() {
        return prod_base_path;
    }

    public void setProd_base_path(String prod_base_path) {
        this.prod_base_path = prod_base_path;
    }

    public String getApi_resource_path() {
        return api_resource_path;
    }

    public void setApi_resource_path(String api_resource_path) {
        this.api_resource_path = api_resource_path;
    }

    public Integer getActive_path() {
        return active_path;
    }

    public void setActive_path(Integer active_path) {
        this.active_path = active_path;
    }

    public Integer getIs_app_active() {
        return is_app_active;
    }

    public void setIs_app_active(Integer is_app_active) {
        this.is_app_active = is_app_active;
    }

    public Integer getIs_app_needs_update() {
        return is_app_needs_update;
    }

    public void setIs_app_needs_update(Integer is_app_needs_update) {
        this.is_app_needs_update = is_app_needs_update;
    }

    public Integer getIs_paypal_active() {
        return is_paypal_active;
    }

    public void setIs_paypal_active(Integer is_paypal_active) {
        this.is_paypal_active = is_paypal_active;
    }

    public Integer getIs_dragonpay_active() {
        return is_dragonpay_active;
    }

    public void setIs_dragonpay_active(Integer is_dragonpay_active) {
        this.is_dragonpay_active = is_dragonpay_active;
    }

    public Integer getIs_globelabs_active() {
        return is_globelabs_active;
    }

    public void setIs_globelabs_active(Integer is_globelabs_active) {
        this.is_globelabs_active = is_globelabs_active;
    }

    public Integer getWill_force_close_when_cancelled_updates() {
        return will_force_close_when_cancelled_updates;
    }

    public void setWill_force_close_when_cancelled_updates(Integer will_force_close_when_cancelled_updates) {
        this.will_force_close_when_cancelled_updates = will_force_close_when_cancelled_updates;
    }

    public Integer getAllow_ads() {
        return allow_ads;
    }

    public void setAllow_ads(Integer allow_ads) {
        this.allow_ads = allow_ads;
    }

    public String getEvent_main_pics_path() {
        return event_main_pics_path;
    }

    public void setEvent_main_pics_path(String event_main_pics_path) {
        this.event_main_pics_path = event_main_pics_path;
    }

    public String getEvent_banner_pics_path() {
        return event_banner_pics_path;
    }

    public void setEvent_banner_pics_path(String event_banner_pics_path) {
        this.event_banner_pics_path = event_banner_pics_path;
    }

    public String getVenue_main_pics_path() {
        return venue_main_pics_path;
    }

    public void setVenue_main_pics_path(String venue_main_pics_path) {
        this.venue_main_pics_path = venue_main_pics_path;
    }

    public String getVenue_banner_pics_path() {
        return venue_banner_pics_path;
    }

    public void setVenue_banner_pics_path(String venue_banner_pics_path) {
        this.venue_banner_pics_path = venue_banner_pics_path;
    }

    public String getBooth_map_path() {
        return booth_map_path;
    }

    public void setBooth_map_path(String booth_map_path) {
        this.booth_map_path = booth_map_path;
    }

    public String getPass_pic_path() {
        return pass_pic_path;
    }

    public void setPass_pic_path(String pass_pic_path) {
        this.pass_pic_path = pass_pic_path;
    }

    public Integer getDistance_threshold() {
        return distance_threshold;
    }

    public void setDistance_threshold(Integer distance_threshold) {
        this.distance_threshold = distance_threshold;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getInterstitial() {
        return interstitial;
    }

    public void setInterstitial(String interstitial) {
        this.interstitial = interstitial;
    }

}
