package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NewShoppingRequest implements Serializable {

    private InputContext context = new InputContext();
    private CommonParms commonParms = new CommonParms();
    private Request request = new Request();

    public InputContext getContext() {
        return context;
    }

    public void setContext(InputContext context) {
        this.context = context;
    }

    public CommonParms getCommonParms() {
        return commonParms;
    }

    public void setCommonParms(CommonParms commonParms) {
        this.commonParms = commonParms;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public class Journey {
        private String originAirportCode;
        private String destinationAirportCode;
        private String originCity;
        private String destinationCity;
        private String originState;
        private String destinationState;
        private String destinationCountry;
        private String originCountry;
        private String aircraftType;
        private String airportType;
        private int operationTypeFAA;

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

        public String getOriginCity() {
            return originCity;
        }

        public void setOriginCity(String originCity) {
            this.originCity = originCity;
        }

        public String getDestinationCity() {
            return destinationCity;
        }

        public void setDestinationCity(String destinationCity) {
            this.destinationCity = destinationCity;
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

        public String getDestinationCountry() {
            return destinationCountry;
        }

        public void setDestinationCountry(String destinationCountry) {
            this.destinationCountry = destinationCountry;
        }

        public String getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }

//        public LocalDate getArrivalDate() {
//            return arrivalDate;
//        }
//
//        public void setArrivalDate(LocalDate arrivalDate) {
//            this.arrivalDate = arrivalDate;
//        }
//
//        public LocalDate getDepartureDate() {
//            return departureDate;
//        }
//
//        public void setDepartureDate(LocalDate departureDate) {
//            this.departureDate = departureDate;
//        }
//
//        public LocalTime getDepartureTime() {
//            return departureTime;
//        }
//
//        public void setDepartureTime(LocalTime departureTime) {
//            this.departureTime = departureTime;
//        }
//
//        public LocalTime getArrivalTime() {
//            return arrivalTime;
//        }
//
//        public void setArrivalTime(LocalTime arrivalTime) {
//            this.arrivalTime = arrivalTime;
//        }

        public String getAircraftType() {
            return aircraftType;
        }

        public void setAircraftType(String aircraftType) {
            this.aircraftType = aircraftType;
        }

        public String getAirportType() {
            return airportType;
        }

        public void setAirportType(String airportType) {
            this.airportType = airportType;
        }

        public int getOperationTypeFAA() {
            return operationTypeFAA;
        }

        public void setOperationTypeFAA(int operationTypeFAA) {
            this.operationTypeFAA = operationTypeFAA;
        }
    }
//
//    public class Cargo{
//        public int cargoItemId;
//        public String specialInstructions;
//        public String cargoType;
//        public String measure;
//        public double weight;
//        public int lengthInchesOrCM;
//        public int widthInchesOrCM;
//        public int heightInchesOrCM;
//
//        public int getCargoItemId() {
//            return cargoItemId;
//        }
//
//        public void setCargoItemId(int cargoItemId) {
//            this.cargoItemId = cargoItemId;
//        }
//
//        public String getSpecialInstructions() {
//            return specialInstructions;
//        }
//
//        public void setSpecialInstructions(String specialInstructions) {
//            this.specialInstructions = specialInstructions;
//        }
//
//        public String getCargoType() {
//            return cargoType;
//        }
//
//        public void setCargoType(String cargoType) {
//            this.cargoType = cargoType;
//        }
//
//        public String getMeasure() {
//            return measure;
//        }
//
//        public void setMeasure(String measure) {
//            this.measure = measure;
//        }
//
//        public double getWeight() {
//            return weight;
//        }
//
//        public void setWeight(double weight) {
//            this.weight = weight;
//        }
//
//        public int getLengthInchesOrCM() {
//            return lengthInchesOrCM;
//        }
//
//        public void setLengthInchesOrCM(int lengthInchesOrCM) {
//            this.lengthInchesOrCM = lengthInchesOrCM;
//        }
//
//        public int getWidthInchesOrCM() {
//            return widthInchesOrCM;
//        }
//
//        public void setWidthInchesOrCM(int widthInchesOrCM) {
//            this.widthInchesOrCM = widthInchesOrCM;
//        }
//
//        public int getHeightInchesOrCM() {
//            return heightInchesOrCM;
//        }
//
//        public void setHeightInchesOrCM(int heightInchesOrCM) {
//            this.heightInchesOrCM = heightInchesOrCM;
//        }
//    }
//
//    public class Pets{
//        public int petItemId;
//        public String petType;
//        public String petName;
//        public String specialInstructions;
//        public String measure;
//        public double weight;
//        public int lengthInchesOrCM;
//        public int widthInchesOrCM;
//        public int heightInchesOrCM;
//
//        public int getPetItemId() {
//            return petItemId;
//        }
//
//        public void setPetItemId(int petItemId) {
//            this.petItemId = petItemId;
//        }
//
//        public String getPetType() {
//            return petType;
//        }
//
//        public void setPetType(String petType) {
//            this.petType = petType;
//        }
//
//        public String getPetName() {
//            return petName;
//        }
//
//        public void setPetName(String petName) {
//            this.petName = petName;
//        }
//
//        public String getSpecialInstructions() {
//            return specialInstructions;
//        }
//
//        public void setSpecialInstructions(String specialInstructions) {
//            this.specialInstructions = specialInstructions;
//        }
//
//        public String getMeasure() {
//            return measure;
//        }
//
//        public void setMeasure(String measure) {
//            this.measure = measure;
//        }
//
//        public double getWeight() {
//            return weight;
//        }
//
//        public void setWeight(double weight) {
//            this.weight = weight;
//        }
//
//        public int getLengthInchesOrCM() {
//            return lengthInchesOrCM;
//        }
//
//        public void setLengthInchesOrCM(int lengthInchesOrCM) {
//            this.lengthInchesOrCM = lengthInchesOrCM;
//        }
//
//        public int getWidthInchesOrCM() {
//            return widthInchesOrCM;
//        }
//
//        public void setWidthInchesOrCM(int widthInchesOrCM) {
//            this.widthInchesOrCM = widthInchesOrCM;
//        }
//
//        public int getHeightInchesOrCM() {
//            return heightInchesOrCM;
//        }
//
//        public void setHeightInchesOrCM(int heightInchesOrCM) {
//            this.heightInchesOrCM = heightInchesOrCM;
//        }
//    }
//
//    public class Baggage{
//        public int baggageItemId;
//        public String baggageType;
//        public int baggageCount;
//        public String specialInstructions;
//        public String measure;
//        public double weight;
//        public int lengthInchesOrCM;
//        public int widthInchesOrCM;
//        public int heightInchesOrCM;
//
//        public int getBaggageItemId() {
//            return baggageItemId;
//        }
//
//        public void setBaggageItemId(int baggageItemId) {
//            this.baggageItemId = baggageItemId;
//        }
//
//        public String getBaggageType() {
//            return baggageType;
//        }
//
//        public void setBaggageType(String baggageType) {
//            this.baggageType = baggageType;
//        }
//
//        public int getBaggageCount() {
//            return baggageCount;
//        }
//
//        public void setBaggageCount(int baggageCount) {
//            this.baggageCount = baggageCount;
//        }
//
//        public String getSpecialInstructions() {
//            return specialInstructions;
//        }
//
//        public void setSpecialInstructions(String specialInstructions) {
//            this.specialInstructions = specialInstructions;
//        }
//
//        public String getMeasure() {
//            return measure;
//        }
//
//        public void setMeasure(String measure) {
//            this.measure = measure;
//        }
//
//        public double getWeight() {
//            return weight;
//        }
//
//        public void setWeight(double weight) {
//            this.weight = weight;
//        }
//
//        public int getLengthInchesOrCM() {
//            return lengthInchesOrCM;
//        }
//
//        public void setLengthInchesOrCM(int lengthInchesOrCM) {
//            this.lengthInchesOrCM = lengthInchesOrCM;
//        }
//
//        public int getWidthInchesOrCM() {
//            return widthInchesOrCM;
//        }
//
//        public void setWidthInchesOrCM(int widthInchesOrCM) {
//            this.widthInchesOrCM = widthInchesOrCM;
//        }
//
//        public int getHeightInchesOrCM() {
//            return heightInchesOrCM;
//        }
//
//        public void setHeightInchesOrCM(int heightInchesOrCM) {
//            this.heightInchesOrCM = heightInchesOrCM;
//        }
//    }
//
//    public class Food{
//        public int foodItemId;
//        public String foodType;
//        public int foodQuantity;
//        public String foodCode;
//        public String specialInstructions;
//
//        public int getFoodItemId() {
//            return foodItemId;
//        }
//
//        public void setFoodItemId(int foodItemId) {
//            this.foodItemId = foodItemId;
//        }
//
//        public String getFoodType() {
//            return foodType;
//        }
//
//        public void setFoodType(String foodType) {
//            this.foodType = foodType;
//        }
//
//        public int getFoodQuantity() {
//            return foodQuantity;
//        }
//
//        public void setFoodQuantity(int foodQuantity) {
//            this.foodQuantity = foodQuantity;
//        }
//
//        public String getFoodCode() {
//            return foodCode;
//        }
//
//        public void setFoodCode(String foodCode) {
//            this.foodCode = foodCode;
//        }
//
//        public String getSpecialInstructions() {
//            return specialInstructions;
//        }
//
//        public void setSpecialInstructions(String specialInstructions) {
//            this.specialInstructions = specialInstructions;
//        }
//    }

    public class OrderItem {
        private int linkedFromOrder;
        private int linkedToOrder;
        private int linkedFromOrderItem;
        private int linkedToOrderItem;
        private int orderItemId;
        private String supplierType;
        private ZonedDateTime departureTimeStamp;
        private String destinationAirportCode;
        private String originAirportCode;
        private String originCountry;
        private String destinationCountry;
        private String originCity;
        private String destinationCity;
        private String originState;
        private String orderReference;
        private String destinationState;
        private String nnumber;
        private int cagAircraftId;
        private ZonedDateTime arrivalTimeStamp;
        private String segmentStatus;
        private int supplierId;
        private int travelTimeMinutes;
        private int originTaxiTime;
        private int destinationTaxiTime;
        private int turnAroundTime;
        private int segmentType;
        private String originIcaoCode;
        private String destinationIcaoCode;
        private int destinationCityRating;
        private int mileage;
        private String tripType;
        private List<Crew> crews = new ArrayList();
        private Ids cargo;
        private Ids pets;
        private Ids baggage;
        private Ids food;
        private int boardLocationId;
        private int arrivalLocationId;
        private int operationTypeFAA;
        private String destinationairportcode;
        private String originairportcode;
        private String segmentstatus;
        private int supplierid;
        private int traveltimeminutes;
        private String originicaocode;
        private int destinationcityrating;
        private String originAirportName;
        private String destinationAirportName;
        private int linkedOrder;
        private int ovrTravelTimeMinutes;
        public int destinationDepartTaxiTime;
        private int destinationArriveTaxiTime;
        private int originArriveTaxiTime;
        private int originDepartTaxiTime;
        private int ovrTurnAroundTime;
        private int originCityRating;
        private int departCityRating;
        private ZoneId zoneId;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private int minPilots;
        public JSONObject toShoppingRequestJson() {
            JSONObject obj = new JSONObject();
            obj.put("orderItemId", orderItemId);
            obj.put("supplierType", supplierType);
            obj.put("departureTimeStamp", departureTimeStamp.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
            obj.put("destinationAirportCode", destinationAirportCode);
            obj.put("originAirportCode", originAirportCode);
            obj.put("originCountry", originCountry);
            obj.put("destinationCountry", destinationCountry);
            obj.put("originCity", originCity);
            obj.put("destinationCity", destinationCity);
            obj.put("originState", originState);
            obj.put("orderReference", orderReference);
            obj.put("destinationState", destinationState);
            obj.put("nnumber", nnumber);
            obj.put("cagAircraftId", cagAircraftId);
            obj.put("arrivalTimeStamp", arrivalTimeStamp.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
            obj.put("segmentStatus", segmentStatus);
            obj.put("supplierId", supplierId);
            obj.put("travelTimeMinutes", travelTimeMinutes);
            obj.put("originTaxiTime", originTaxiTime);
            obj.put("destinationTaxiTime", destinationTaxiTime);
            obj.put("turnAroundTime", turnAroundTime);
            obj.put("segmentType", segmentType);
            obj.put("originIcaoCode", originIcaoCode);
            obj.put("destinationIcaoCode", destinationIcaoCode);
            obj.put("destinationCityRating", destinationCityRating);
            obj.put("tripType", tripType);
            JSONArray crewArray = new JSONArray();
            for (Crew crew : crews)
                crewArray.put(crew.toJson());
            obj.put("CrewList", crewArray);
            if (cargo != null)
                obj.put("cargo", cargo.toJson());
            if (pets != null)
                obj.put("pets", pets.toJson());
            if (baggage != null)
                obj.put("baggage", baggage.toJson());
            if (food != null)
                obj.put("food", food.toJson());
            obj.put("boardLocationId", boardLocationId);
            obj.put("arrivalLocationId", arrivalLocationId);
            obj.put("operationTypeFAA", operationTypeFAA);
            obj.put("destinationairportcode", destinationairportcode);
            obj.put("originairportcode", originairportcode);
            obj.put("segmentstatus", segmentstatus);
            obj.put("supplierid", supplierid);
            obj.put("traveltimeminutes", traveltimeminutes);
            obj.put("originicaocode", originicaocode);
            obj.put("destinationcityrating", destinationcityrating);
            obj.put("linkedOrder", linkedOrder);
            obj.put("ovrTravelTimeMinutes", ovrTravelTimeMinutes);
            obj.put("destinationDepartTaxiTime", destinationDepartTaxiTime);
            obj.put("destinationArriveTaxiTime", destinationArriveTaxiTime);
            obj.put("originArriveTaxiTime", originArriveTaxiTime);
            obj.put("originDepartTaxiTime", originDepartTaxiTime);
            obj.put("ovrTurnAroundTime", ovrTurnAroundTime);
            obj.put("originCityRating", originCityRating);
            obj.put("departCityRating", departCityRating);
            obj.put("linedOrderFrom", linkedFromOrder);
            obj.put("linedOrderTo", linkedToOrder);
            obj.put("minPilots", minPilots);
            return obj;
        }

        public int getLinkedFromOrder() {
            return linkedFromOrder;
        }

        public void setLinkedFromOrder(int linkedFromOrder) {
            this.linkedFromOrder = linkedFromOrder;
        }

        public int getLinkedToOrder() {
            return linkedToOrder;
        }

        public void setLinkedToOrder(int linkedToOrder) {
            this.linkedToOrder = linkedToOrder;
        }

        public void setOrderItemId(int orderItemId) {
            this.orderItemId = orderItemId;
        }

        public Integer getOrderItemId() {
            return orderItemId;
        }

        public void setOrderItemId(Integer orderItemId) {
            this.orderItemId = orderItemId;
        }

        public int getLinkedFromOrderItem() {
            return linkedFromOrderItem;
        }

        public void setLinkedFromOrderItem(int linkedFromOrderItem) {
            this.linkedFromOrderItem = linkedFromOrderItem;
        }

        public int getLinkedToOrderItem() {
            return linkedToOrderItem;
        }

        public void setLinkedToOrderItem(int linkedToOrderItem) {
            this.linkedToOrderItem = linkedToOrderItem;
        }

        public String getSupplierType() {
            return supplierType;
        }

        public void setSupplierType(String supplierType) {
            this.supplierType = supplierType;
        }

//        public LocalDateTime getDepartureTimeStamp() {
//            return departureTimeStamp;
//        }
//
//        public void setDepartureTimeStamp(LocalDateTime departureTimeStamp) {
//            this.departureTimeStamp = departureTimeStamp;
//        }

        public String getDestinationAirportCode() {
            return destinationAirportCode;
        }

        public void setDestinationAirportCode(String destinationAirportCode) {
            this.destinationAirportCode = destinationAirportCode;
        }

        public String getOriginAirportCode() {
            return originAirportCode;
        }

        public void setOriginAirportCode(String originAirportCode) {
            this.originAirportCode = originAirportCode;
        }

        public String getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }

        public String getDestinationCountry() {
            return destinationCountry;
        }

        public void setDestinationCountry(String destinationCountry) {
            this.destinationCountry = destinationCountry;
        }

        public String getOriginCity() {
            return originCity;
        }

        public void setOriginCity(String originCity) {
            this.originCity = originCity;
        }

        public String getDestinationCity() {
            return destinationCity;
        }

        public void setDestinationCity(String destinationCity) {
            this.destinationCity = destinationCity;
        }

        public String getOriginState() {
            return originState;
        }

        public void setOriginState(String originState) {
            this.originState = originState;
        }

        public String getOrderReference() {
            return orderReference;
        }

        public void setOrderReference(String orderReference) {
            this.orderReference = orderReference;
        }

        public String getDestinationState() {
            return destinationState;
        }

        public void setDestinationState(String destinationState) {
            this.destinationState = destinationState;
        }

        public String getNnumber() {
            return nnumber;
        }

        public void setNnumber(String nnumber) {
            this.nnumber = nnumber;
        }

        public int getCagAircraftId() {
            return cagAircraftId;
        }

        public void setCagAircraftId(int cagAircraftId) {
            this.cagAircraftId = cagAircraftId;
        }

        public String getSegmentStatus() {
            return segmentStatus;
        }

        public void setSegmentStatus(String segmentStatus) {
            this.segmentStatus = segmentStatus;
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

        public int getOriginTaxiTime() {
            return originTaxiTime;
        }

        public void setOriginTaxiTime(int originTaxiTime) {
            this.originTaxiTime = originTaxiTime;
        }

        public int getDestinationTaxiTime() {
            return destinationTaxiTime;
        }

        public void setDestinationTaxiTime(int destinationTaxiTime) {
            this.destinationTaxiTime = destinationTaxiTime;
        }

        public int getTurnAroundTime() {
            return turnAroundTime;
        }

        public void setTurnAroundTime(int turnAroundTime) {
            this.turnAroundTime = turnAroundTime;
        }

        public int getSegmentType() {
            return segmentType;
        }

        public void setSegmentType(int segmentType) {
            this.segmentType = segmentType;
        }

        public String getOriginIcaoCode() {
            return originIcaoCode;
        }

        public void setOriginIcaoCode(String originIcaoCode) {
            this.originIcaoCode = originIcaoCode;
        }

        public String getDestinationIcaoCode() {
            return destinationIcaoCode;
        }

        public void setDestinationIcaoCode(String destinationIcaoCode) {
            this.destinationIcaoCode = destinationIcaoCode;
        }

        public int getDestinationCityRating() {
            return destinationCityRating;
        }

        public void setDestinationCityRating(int destinationCityRating) {
            this.destinationCityRating = destinationCityRating;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public String getTripType() {
            return tripType;
        }

        public void setTripType(String tripType) {
            this.tripType = tripType;
        }

        public List<Crew> getCrews() {
            return crews;
        }

        public void setCrews(List<Crew> crews) {
            this.crews = crews;
        }

        public Ids getCargo() {
            return cargo;
        }

        public void setCargo(Ids cargo) {
            this.cargo = cargo;
        }

        public Ids getPets() {
            return pets;
        }

        public void setPets(Ids pets) {
            this.pets = pets;
        }

        public Ids getBaggage() {
            return baggage;
        }

        public void setBaggage(Ids baggage) {
            this.baggage = baggage;
        }

        public Ids getFood() {
            return food;
        }

        public void setFood(Ids food) {
            this.food = food;
        }

        public int getBoardLocationId() {
            return boardLocationId;
        }

        public void setBoardLocationId(int boardLocationId) {
            this.boardLocationId = boardLocationId;
        }

        public int getArrivalLocationId() {
            return arrivalLocationId;
        }

        public void setArrivalLocationId(int arrivalLocationId) {
            this.arrivalLocationId = arrivalLocationId;
        }

        public int getOperationTypeFAA() {
            return operationTypeFAA;
        }

        public void setOperationTypeFAA(int operationTypeFAA) {
            this.operationTypeFAA = operationTypeFAA;
        }


        public void setDestinationairportcode(String destinationairportcode) {
            this.destinationairportcode = destinationairportcode;
        }

        public String getOriginairportcode() {
            return originairportcode;
        }

        public void setOriginairportcode(String originairportcode) {
            this.originairportcode = originairportcode;
        }


        public String getSegmentstatus() {
            return segmentstatus;
        }

        public void setSegmentstatus(String segmentstatus) {
            this.segmentstatus = segmentstatus;
        }


        public int getTraveltimeminutes() {
            return traveltimeminutes;
        }

        public void setTraveltimeminutes(int traveltimeminutes) {
            this.traveltimeminutes = traveltimeminutes;
        }

        public String getOriginicaocode() {
            return originicaocode;
        }

        public void setOriginicaocode(String originicaocode) {
            this.originicaocode = originicaocode;
        }

        public int getDestinationcityrating() {
            return destinationcityrating;
        }

        public void setDestinationcityrating(int destinationcityrating) {
            this.destinationcityrating = destinationcityrating;
        }

        public String getDestinationairportcode() {
            return destinationairportcode;
        }

        public int getSupplierid() {
            return supplierid;
        }

        public void setSupplierid(int supplierid) {
            this.supplierid = supplierid;
        }

        public String getOriginAirportName() {
            return originAirportName;
        }

        public void setOriginAirportName(String originAirportName) {
            this.originAirportName = originAirportName;
        }

        public String getDestinationAirportName() {
            return destinationAirportName;
        }

        public void setDestinationAirportName(String destinationAirportName) {
            this.destinationAirportName = destinationAirportName;
        }

        public int getLinkedOrder() {
            return linkedOrder;
        }

        public void setLinkedOrder(int linkedOrder) {
            this.linkedOrder = linkedOrder;
        }

        public int getOvrTravelTimeMinutes() {
            return ovrTravelTimeMinutes;
        }

        public void setOvrTravelTimeMinutes(int ovrTravelTimeMinutes) {
            this.ovrTravelTimeMinutes = ovrTravelTimeMinutes;
        }

        public int getDestinationDepartTaxiTime() {
            return destinationDepartTaxiTime;
        }

        public void setDestinationDepartTaxiTime(int destinationDepartTaxiTime) {
            this.destinationDepartTaxiTime = destinationDepartTaxiTime;
        }

        public int getDestinationArriveTaxiTime() {
            return destinationArriveTaxiTime;
        }

        public void setDestinationArriveTaxiTime(int destinationArriveTaxiTime) {
            this.destinationArriveTaxiTime = destinationArriveTaxiTime;
        }

        public int getOriginArriveTaxiTime() {
            return originArriveTaxiTime;
        }

        public void setOriginArriveTaxiTime(int originArriveTaxiTime) {
            this.originArriveTaxiTime = originArriveTaxiTime;
        }

        public int getOriginDepartTaxiTime() {
            return originDepartTaxiTime;
        }

        public void setOriginDepartTaxiTime(int originDepartTaxiTime) {
            this.originDepartTaxiTime = originDepartTaxiTime;
        }

        public int getOvrTurnAroundTime() {
            return ovrTurnAroundTime;
        }

        public void setOvrTurnAroundTime(int ovrTurnAroundTime) {
            this.ovrTurnAroundTime = ovrTurnAroundTime;
        }

        public int getOriginCityRating() {
            return originCityRating;
        }

        public void setOriginCityRating(int originCityRating) {
            this.originCityRating = originCityRating;
        }

        public int getDepartCityRating() {
            return departCityRating;
        }

        public void setDepartCityRating(int departCityRating) {
            this.departCityRating = departCityRating;
        }

        public ZoneId getZoneId() {
            return zoneId;
        }

        public void setZoneId(ZoneId zoneId) {
            this.zoneId = zoneId;
        }

        public LocalDateTime getStartTime() {
            return startTime;
        }

        public void setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
        }

        public LocalDateTime getEndTime() {
            return endTime;
        }

        public void setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
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

        public int getMinPilots() {
            return minPilots;
        }

        public void setMinPilots(int minPilots) {
            this.minPilots = minPilots;
        }
    }


    public class warnning {
        private int number;
        private String message;

        public JSONObject toJson() {
            JSONObject obj = new JSONObject();
            JSONArray idArray = new JSONArray();
            obj.put("number", number);
            obj.put("message", message);
            return obj;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public class Ids {
        List<Integer> id = new ArrayList<>();

        public JSONObject toJson() {
            JSONObject obj = new JSONObject();
            JSONArray idArray = new JSONArray();
            for (Integer ids : id)
                idArray.put(ids);
            obj.put("id", idArray);
            return obj;
        }

        public void setId(List<Integer> id) {
            this.id = id;
        }

    }

    public class Option {
        private int orderId;
        private String orderStatus;
        private String orderSubStatus;
        private String assignCrew;
        private String assignOfDuty;
        private String assignShiftingDuty;
        private List<OrderItem> orderItems;


        public JSONObject toJson() {
            JSONObject obj = new JSONObject();
            obj.put("orderId", orderId);
            obj.put("orderStatus", orderStatus);
            obj.put("orderSubStatus", orderSubStatus);
            JSONArray items = new JSONArray();
            for (OrderItem item : orderItems)
                items.put(item.toShoppingRequestJson());
            obj.put("orderItems", items);
            return obj;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public List<OrderItem> getOrderItems() {
            return orderItems;
        }

        public void setOrderItems(List<OrderItem> orderItems) {
            this.orderItems = orderItems;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getOrderSubStatus() {
            return orderSubStatus;
        }

        public void setOrderSubStatus(String orderSubStatus) {
            this.orderSubStatus = orderSubStatus;
        }

        public String getAssignCrew() {
            return assignCrew;
        }

        public void setAssignCrew(String assignCrew) {
            this.assignCrew = assignCrew;
        }

        public String getAssignOfDuty() {
            return assignOfDuty;
        }

        public void setAssignOfDuty(String assignOfDuty) {
            this.assignOfDuty = assignOfDuty;
        }

        public String getAssignShiftingDuty() {
            return assignShiftingDuty;
        }

        public void setAssignShiftingDuty(String assignShiftingDuty) {
            this.assignShiftingDuty = assignShiftingDuty;
        }
    }


    public class Address {
        private String lang;
        private String addr1;
        private String addr2;
        private String addr3;
        private String city;
        private String state;
        private String country;
        private String pcode;
    }

    public class Phone {
        private String lang;
        private int countryCode;
        private int areaCode;
        private int number;

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public int getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public int getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(int areaCode) {
            this.areaCode = areaCode;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public class Location {
        public int locationId;
        public String name;
        public Address address;
        public Phone phone;
        public String contact;

        public int getLocationId() {
            return locationId;
        }

        public void setLocationId(int locationId) {
            this.locationId = locationId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public Phone getPhone() {
            return phone;
        }

        public void setPhone(Phone phone) {
            this.phone = phone;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }
    }

    public class Request {
        //        public List<Journey> journey;
        public List<Option> options;
        //        public List<Cargo> cargo;
//        public List<Pets> pets;
//        public List<Baggage> baggage;
//        public List<Food> food;
//        public List<Location> locations;

//        public List<Journey> getJourney() {
//            return journey;
//        }
//
//        public void setJourney(List<Journey> journey) {
//            this.journey = journey;
//        }

//
//        public List<Journey> getJourney() {
//            return journey;
//        }
//
//        public void setJourney(List<Journey> journey) {
//            this.journey = journey;
//        }

        public List<Option> getOptions() {
            return options;
        }

        public void setOptions(List<Option> options) {
            this.options = options;
        }

//        public List<Location> getLocations() {
//            return locations;
//        }
//
//        public void setLocations(List<Location> locations) {
//            this.locations = locations;
//        }
    }


}
