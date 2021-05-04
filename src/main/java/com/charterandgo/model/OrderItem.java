package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private int orderItemId;
    private String supplierType;
    private int supplierId;
    private String nnumber;
    private String originCity;
    private long cagAircraftId;
    private BigDecimal mileage;
    private int originDepartTaxiTime;
    private int originArriveTaxiTime;
    private int destinationDepartTaxiTime;
    private int destinationArriveTaxiTime;
    private int turnAroundTime;
    private int ovrTurnAourndTime;
    private String destinationIcaoCode;
    private long linkedFromOrder;
    private int linkedFromOrderItem;
    private long linkedToOrder;
    private int linkedToOrderItem;
    private int segmentType;
    private String destinationCity;
    private int originCityRating;
    private int operationTypeFAA;
    private int travelTimeMinutes;
    private String originAirportCode;
    private String destinationAirportCode;
    private ZonedDateTime departureTimeStamp;
    private ZonedDateTime arrivalTimeStamp;
    private String aircraftType;
    private String segmentStatus;
    private String oldSegmentStatus;
    private String tripType;
    private int destinationCityRating;
    private String originIcaoCode;
    private String originCountry;
    private List<Crew> crews = new ArrayList<>();
    private List<Cost> costs = new ArrayList<>();
    private List<Price> itemPrices = new ArrayList<>();
    private String originState;
    private String originFboId;
    private String destinationCountry;
    private String destinationState;
    private String destinationFboId;
    private String manufacturer;
    private String model;
    private String crewstatus;
    private int duration;
    private int ovrTravelTimeMinutes;
    private int ovrTurnAroundTime;
    private String departureAirportName;
    private String arrivalAirportName;


    public OrderItem() {

    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(orderItemId + "/");
        builder.append(originAirportCode + "/");
        builder.append(destinationAirportCode + "/");
        builder.append(segmentStatus + "/");
        builder.append(mileage + "/");
        builder.append(nnumber + "/");
        if (supplierId != 0) {
            builder.append(supplierId + "/");
        }
        builder.append(travelTimeMinutes + "-");
        if (!itemPrices.isEmpty()) {
            builder.append(itemPrices.toString());
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("orderItemId", orderItemId);
        obj.put("supplierType", supplierType);
        obj.put("supplierId", supplierId);
        obj.put("nnumber", nnumber);
        obj.put("originCity", originCity);
        obj.put("cagAircraftId", cagAircraftId);
        obj.put("mileage", mileage);
        obj.put("originDepartTaxiTime", originDepartTaxiTime);
        obj.put("originArriveTaxiTime", originArriveTaxiTime);
        obj.put("destinationDepartTaxiTime", destinationDepartTaxiTime);
        obj.put("destinationArriveTaxiTime", destinationArriveTaxiTime);
        obj.put("turnAroundTime", turnAroundTime);
        obj.put("ovrTurnAourndTime", ovrTurnAourndTime);
        obj.put("destinationIcaoCode", destinationIcaoCode);
        obj.put("linkedFromOrder", linkedFromOrder);
        obj.put("linkedFromOrderItem", linkedFromOrderItem);
        obj.put("linkedToOrder", linkedToOrder);
        obj.put("segmentType", segmentType);
        obj.put("destinationCity", destinationCity);
        obj.put("originCityRating", originCityRating);
        obj.put("operationTypeFAA", operationTypeFAA);
        obj.put("travelTimeMinutes", travelTimeMinutes);
        obj.put("originAirportCode", originAirportCode);
        obj.put("destinationAirportCode", destinationAirportCode);
        if (departureTimeStamp != null) {
            obj.put("departureTimestamp", departureTimeStamp.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        }
        if (arrivalTimeStamp != null) {
            obj.put("arrivalTimeStamp", arrivalTimeStamp.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        }
        obj.put("aircraftType", aircraftType);
        obj.put("segmentStatus", segmentStatus);
        obj.put("oldSegmentStatus", oldSegmentStatus);
        obj.put("tripType", tripType);
        obj.put("destinationCityRating", destinationCityRating);
        obj.put("originIcaoCode", originIcaoCode);
        obj.put("originCountry", originCountry);
        obj.put("originState", originState);
        obj.put("originFboId", originFboId);
        obj.put("destinationCountry", destinationCountry);
        obj.put("destinationState", destinationState);
        obj.put("destinationFboId", destinationFboId);
        obj.put("manufacturer", manufacturer);
        obj.put("model", model);
        obj.put("crewstatus", crewstatus);
        obj.put("ovrTravelTimeMinutes", ovrTravelTimeMinutes);
        obj.put("ovrTurnArountTime", ovrTurnAroundTime);
        obj.put("departureAirportName", departureAirportName);
        obj.put("arrivalAirportName", arrivalAirportName);
        obj.put("duration", duration);

        JSONArray array = new JSONArray();
        for (Crew crew : crews) {
            array.put(crew.toJson());
        }
        obj.put("crews", array);
        JSONArray costArray = new JSONArray();
        if (!costs.isEmpty()) {
            for (Cost cost : costs) {
                costArray.put(cost.toJson());
            }
            obj.put("costs", costArray);
        }
        if (!itemPrices.isEmpty()) {
            JSONArray prices = new JSONArray();
            obj.put("itemprices",prices);
            for (Price price : itemPrices) {
                prices.put(price.toJson());
            }
        }
        return obj;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOriginAirportCode() {
        return originAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        this.originAirportCode = originAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public String getSegmentStatus() {
        return segmentStatus;
    }

    public void setSegmentStatus(String segmentStatus) {
        this.segmentStatus = segmentStatus;
    }

    public String getNnumber() {
        return nnumber;
    }

    public void setNnumber(String nnumber) {
        this.nnumber = nnumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getTravelTimeMinutes() {
        return travelTimeMinutes;
    }

    public void setTravelTimeMinutes(int travelTimeMinutes) {
        this.travelTimeMinutes = travelTimeMinutes;
    }

    public String getOriginFboId() {
        return originFboId;
    }

    public void setOriginFboId(String originFboId) {
        this.originFboId = originFboId;
    }

    public String getDestinationFboId() {
        return destinationFboId;
    }

    public void setDestinationFboId(String destinationFboId) {
        this.destinationFboId = destinationFboId;
    }

    public ZonedDateTime getDepartureTimeStamp() {
        return departureTimeStamp;
    }

    public void setDepartureTimeStamp(ZonedDateTime departureTimeStamp) {
        this.departureTimeStamp = departureTimeStamp;
    }

    public ZonedDateTime getArrivalTimeStamp() {
        return arrivalTimeStamp;
    }

    public void setArrivalTimeStamp(ZonedDateTime arrivalTimeStamp) {
        this.arrivalTimeStamp = arrivalTimeStamp;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getCrewstatus() {
        return crewstatus;
    }

    public void setCrewstatus(String crewstatus) {
        this.crewstatus = crewstatus;
    }

    public List<Crew> getCrews() {
        return crews;
    }

    public void setCrews(List<Crew> crews) {
        this.crews = crews;
    }

    public List<Cost> getCosts() {
        return costs;
    }

    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }

    public List<Price> getitemprices() {
        return itemPrices;
    }

    public void setitemprices(List<Price> prices) {
        this.itemPrices = prices;
    }

    public String getOriginIcaoCode() {
        return originIcaoCode;
    }

    public void setOriginIcaoCode(String originIcaoCode) {
        this.originIcaoCode = originIcaoCode;
    }

    public int getDestinationCityRating() {
        return destinationCityRating;
    }

    public void setDestinationCityRating(int destinationCityRating) {
        this.destinationCityRating = destinationCityRating;
    }

    public String getOrigincountry() {
        return originCountry;
    }

    public void setOrigincountry(String origincountry) {
        this.originCountry = origincountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getOriginState() {
        return originState;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getCagAircraftId() {
        return cagAircraftId;
    }

    public void setCagAircraftId(long cagAircraftId) {
        this.cagAircraftId = cagAircraftId;
    }

    public int getOriginDepartTaxiTime() {
        return originDepartTaxiTime;
    }

    public void setOriginDepartTaxiTime(int originDepartTaxiTime) {
        this.originDepartTaxiTime = originDepartTaxiTime;
    }

    public int getDestinationDepartTaxiTime() {
        return destinationDepartTaxiTime;
    }

    public void setDestinationDepartTaxiTime(int destinationDepartTaxiTime) {
        this.destinationDepartTaxiTime = destinationDepartTaxiTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public int getOperationTypeFAA() {
        return operationTypeFAA;
    }

    public void setOperationTypeFAA(int operationTypeFAA) {
        this.operationTypeFAA = operationTypeFAA;
    }

    public int getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(int segmentType) {
        this.segmentType = segmentType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public int getOriginArriveTaxiTime() {
        return originArriveTaxiTime;
    }

    public void setOriginArriveTaxiTime(int originArriveTaxiTime) {
        this.originArriveTaxiTime = originArriveTaxiTime;
    }

    public int getDestinationArriveTaxiTime() {
        return destinationArriveTaxiTime;
    }

    public void setDestinationArriveTaxiTime(int destinationArriveTaxiTime) {
        this.destinationArriveTaxiTime = destinationArriveTaxiTime;
    }

    public int getOvrTurnAourndTime() {
        return ovrTurnAourndTime;
    }

    public void setOvrTurnAourndTime(int ovrTurnAourndTime) {
        this.ovrTurnAourndTime = ovrTurnAourndTime;
    }

    public String getDestinationIcaoCode() {
        return destinationIcaoCode;
    }

    public void setDestinationIcaoCode(String destinationIcaoCode) {
        this.destinationIcaoCode = destinationIcaoCode;
    }

    public long getLinkedFromOrder() {
        return linkedFromOrder;
    }

    public void setLinkedFromOrder(long linkedFromOrder) {
        this.linkedFromOrder = linkedFromOrder;
    }

    public int getLinkedFromOrderItem() {
        return linkedFromOrderItem;
    }

    public void setLinkedFromOrderItem(int linkedFromOrderItem) {
        this.linkedFromOrderItem = linkedFromOrderItem;
    }

    public long getLinkedToOrder() {
        return linkedToOrder;
    }

    public void setLinkedToOrder(long linkedToOrder) {
        this.linkedToOrder = linkedToOrder;
    }

    public int getLinkedToOrderItem() {
        return linkedToOrderItem;
    }

    public void setLinkedToOrderItem(int linkedToOrderItem) {
        this.linkedToOrderItem = linkedToOrderItem;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getOriginCityRating() {
        return originCityRating;
    }

    public void setOriginCityRating(int originCityRating) {
        this.originCityRating = originCityRating;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public List<Price> getItemPrices() {
        return itemPrices;
    }

    public void setItemPrices(List<Price> itemPrices) {
        this.itemPrices = itemPrices;
    }

    public String getOldSegmentStatus() {
        return oldSegmentStatus;
    }

    public void setOldSegmentStatus(String oldSegmentStatus) {
        this.oldSegmentStatus = oldSegmentStatus;
    }

    public int getOvrTravelTimeMinutes() {
        return ovrTravelTimeMinutes;
    }

    public void setOvrTravelTimeMinutes(int ovrTravelTimeMinutes) {
        this.ovrTravelTimeMinutes = ovrTravelTimeMinutes;
    }

    public int getOvrTurnAroundTime() {
        return ovrTurnAroundTime;
    }

    public void setOvrTurnAroundTime(int ovrTurnAroundTime) {
        this.ovrTurnAroundTime = ovrTurnAroundTime;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
    }
}
