package com.charterandgo.model;

import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.Date;

public class Runway {

    private String siteNumber;
    private String runwayId;
    private int runwayLength;
    private int runwayWidth;
    private String runwaySurfaceCond;
    private String runwaySurfaceTreatment;
    private String pavementClass;
    private String edgeLightsIntensity;
    private String baseEndId;
    private int baseEndTrueAlignment;
    private String baseEndILSType;
    private String baseEndRightTrafficPattern;
    private String baseEndMarkingsType;
    private String baseEndMarkingsCondition;
    private BigDecimal baseEndPhysicalLat = new BigDecimal(0.0000000000);
    private String baseEndPhysicalLatS;
    private BigDecimal baseEndPhysicalLong  = new BigDecimal(0.0000000000);;
    private String baseEndPhysicalLongS;
    private BigDecimal baseEndPhysicalElevation;
    private BigDecimal baseEndCrossingHeight;
    private BigDecimal baseEndGlidePathAngle;
    private BigDecimal baseEndDisplacedLat  = new BigDecimal(0.0000000000);;
    private String baseEndDisplacedLatS;
    private BigDecimal baseEndDisplacedLong = new BigDecimal(0.0000000000);;
    private String baseEndDisplacedLongS;
    private BigDecimal baseEndDisplacedElevation;
    private BigDecimal baseEndDisplacedLength;
    private BigDecimal baseEndTDZElevation;
    private String baseEndVASI;
    private String baseEndRVR;
    private String baseEndRVV;
    private String baseEndALS;
    private String baseEndREIL;
    private String baseEndCenterlineLights;
    private String baseEndTouchdownLights;
    private String baseEndObjectDesc;
    private String baseEndObjectMarkLight;
    private String baseEndPart77Category;
    private BigDecimal baseEndObjectClearSlope;
    private BigDecimal baseEndObjectHeight;
    private BigDecimal baseEndObjectDistance;
    private String baseEndObjectOffset;
    private String reciprocalEndID;
    private int reciprocalEndTrueAlignment;
    private String recipricolEndILSType;
    private String reciprocalEndRightTrafficPattern;
    private String reciprocalEndMarkingsType;
    private String reciprocalEndMarkingsCondition;;
    private BigDecimal reciprocalEndPhysicalLat = new BigDecimal(0.0000000000);;
    private String reciprocalEndPhysicalLatS;
    private BigDecimal reciprocalEndPhysicalLong = new BigDecimal(0.0000000000);;
    private String reciprocalEndPhysicalLongS;
    private BigDecimal reciprocalEndPhysicalElevation;
    private BigDecimal reciprocalEndCrossingHeight;
    private BigDecimal reciprocalEndGlidePathAngle;
    private BigDecimal reciprocalEndDisplacedLat = new BigDecimal(0.0000000000);;
    private String reciprocalEndDisplacedLatS;
    private BigDecimal reciprocalEndDisplacedLong = new BigDecimal(0.0000000000);;
    private String reciprocalEndDisplacedLongS;
    private BigDecimal reciprocalEndDisplacedElevation;
    private BigDecimal reciprocalEndDisplacedLength;
//    private BigDecimal reciprocalEndDisplacedTDZElevation;
    private BigDecimal reciprocalEndTDZElevation;
    private String reciprocalEndVASI;
    private String reciprocalEndRVR;
    private String reciprocalEndRVV;
    private String reciprocalEndALS;
    private String reciprocalEndREIL;
    private String reciprocalEndCenterlineLights;
    private String reciprocalEndTouchdownLights;
    private String reciprocalEndObjectDescription;
    private String reciprocalEndObjectMarkLight;
    private String reciprocalEndPart77Category;
    private BigDecimal reciprocalEndObjectClearSlope;
    private BigDecimal reciprocalEndObjectHeight;
    private BigDecimal reciprocalEndObjectDistance;
    private String reciprocalEndObjectOffset;
    private String runwayLengthSource;
    private Date runwayLengthSourceDate;
    private BigDecimal runwayWeightBearingCapacitySW;
    private BigDecimal runwayWeightBearingCapacityDW;
    private BigDecimal runwayWeightBearingCapacityDT;
    private BigDecimal runwayWeightBearingCapacityDDT;
    private int baseEndGradient;
    private String baseEndGradientDirection;
    private String baseEndPositionSource;
    private Date baseEndPositionSourceDate;
    private String baseEndElevationSource;
    private Date baseEndElevationSourceDate;
    private String baseEndDisplacedThresholdPositionSource;
    private Date baseEndDisplacedThresholdPositionSourceDate;
    private String baseEndDisplacedThresholdElevationSource;
    private Date baseEndDisplacedThresholdElevationSourceDate;
    private String baseEndTouchdownZoneElevationSource;
    private Date baseEndTouchdownZoneElevationSourceDate;
    private int baseEndTakeOffRunAvailableTORA;
    private int baseEndTakeOffDistanceAvailableTODA;
    private int baseEndAcltStopDistanceAvailableASDA;
    private int baseEndLandingDistanceAvailableLDA;
    private int baseEndLandingDistanceAvailableLAHSO;
    private String baseEndLandingDistanceAvailableLAHSOIntRwyID;
    private String baseEndLandingDistanceAvailableLAHSOIntEntityDesc;
    private BigDecimal baseEndLandingDistanceAvailableLAHSOHldPtLatitude = new BigDecimal(0.0000000000);;
    private String baseEndLandingDistanceAvailableLAHSOHldPtLatitudeS;
    private BigDecimal baseEndLandingDistanceAvailableLAHSOHldPtLongitude = new BigDecimal(0.0000000000);;
    private String baseEndLandingDistanceAvailableLAHSOHldPtLongitudeS;
    private String baseEndLandingDistanceAvailableLAHSOCoordSrc;
    private String baseEndLandingDistanceAvailableLAHSOCoordSrcDate;
    private String reciprocalEndGradient;
    private String reciprocalEndGradientDirection;
    private String reciprocalEndPositionSource;
    private Date reciprocalEndPositionSourceDate;
    private String reciprocalEndElevationSource;
    private Date reciprocalEndElevationSourceDate;
    private String reciprocalEndDisplacedThresholdPositionSource;
    private Date reciprocalEndDisplacedThresholdPositionSourceDate;
    private String reciprocalEndDisplacedThresholdElevationSource;
    private Date reciprocalEndDisplacedThresholdElevationSourceDate;
    private String reciprocalEndTouchdownZoneElevationSource;
    private Date reciprocalEndTouchdownZoneElevationSourceDate;
    private int reciprocalEndTakeOffRunAvailableTORA;
    private int reciprocalEndTakeOffDistanceAvailableTODA;
    private int reciprocalEndAcltStopDistanceAvailableASDA;
    private int reciprocalEndLandingDistanceAvailableLDA;
    private int reciprocalEndLandingDistanceAvailableLAHSO;
    private String reciprocalEndLandingDistanceAvailableLAHSOIntRwyID;
    private String reciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc;
    private BigDecimal reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude = new BigDecimal(0.0000000000);;
    private String reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS;
    private BigDecimal reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude = new BigDecimal(0.0000000000);;
    private String reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS;
    private String reciprocalEndLandingDistanceAvailableLAHSOCoordSrc;
    private String reciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate;
    private Date lastUpdated;

    public Runway() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("runwayId", runwayId);
        obj.put("runwayLength", runwayLength);
        obj.put("runwayWidth",runwayWidth );
        obj.put("runwaySurfaceCond", runwaySurfaceCond);
        obj.put("runwaySurfaceTreatment", runwaySurfaceTreatment);
        obj.put("pavementClass", pavementClass);
        obj.put("edgeLightsIntensity", edgeLightsIntensity);
        obj.put("baseEndId", baseEndId);
        obj.put("baseEndTrueAlignment", baseEndTrueAlignment);
        obj.put("baseEndILSType", baseEndILSType);
        obj.put("baseEndRightTrafficPattern", baseEndRightTrafficPattern);
        obj.put("baseEndMarkingsType", baseEndMarkingsType);
        obj.put("baseEndMarkingsCondition", baseEndMarkingsCondition);
        obj.put("baseEndPhysicalLat", baseEndPhysicalLat);
        obj.put("baseEndPhysicalLatS", baseEndPhysicalLatS);
        obj.put("baseEndPhysicalLong", baseEndPhysicalLong);
        obj.put("baseEndPhysicalLongS", baseEndPhysicalLongS);
        obj.put("baseEndPhysicalElevation", baseEndPhysicalElevation);
        obj.put("baseEndCrossingHeight", baseEndCrossingHeight);
        obj.put("baseEndGlidePathAngle", baseEndGlidePathAngle);
        obj.put("baseEndDisplacedLat", baseEndDisplacedLat);
        obj.put("baseEndDisplacedLatS", baseEndDisplacedLatS);
        obj.put("baseEndDisplacedLong", baseEndDisplacedLong);
        obj.put("baseEndDisplacedLongS", baseEndDisplacedLongS);
        obj.put("baseEndDisplacedElevation", baseEndDisplacedElevation);
        obj.put("baseEndDisplacedLength", baseEndDisplacedLength);
        obj.put("baseEndTDZElevation", baseEndTDZElevation);
        obj.put("baseEndVASI",baseEndVASI );
        obj.put("baseEndRVR", baseEndRVR);
        obj.put("baseEndRVV", baseEndRVV);
        obj.put("baseEndALS", baseEndALS);
        obj.put("baseEndREIL", baseEndREIL);
        obj.put("baseEndCenterlineLights", baseEndCenterlineLights);
        obj.put("baseEndTouchdownLights", baseEndTouchdownLights);
        obj.put("baseEndObjectDesc", baseEndObjectDesc);
        obj.put("baseEndObjectMarkLight", baseEndObjectMarkLight);
        obj.put("baseEndPart77Category", baseEndPart77Category);
        obj.put("baseEndObjectClearSlope", baseEndObjectClearSlope);
        obj.put("baseEndObjectHeight", baseEndObjectHeight);
        obj.put("baseEndObjectDistance", baseEndObjectDistance);
        obj.put("baseEndObjectOffset", baseEndObjectOffset);
        obj.put("reciprocalEndID", reciprocalEndID);
        obj.put("reciprocalEndTrueAlignment", reciprocalEndTrueAlignment);
        obj.put("recipricolEndILSType", recipricolEndILSType);
        obj.put("reciprocalEndRightTrafficPattern", reciprocalEndRightTrafficPattern);
        obj.put("reciprocalEndMarkingsType", reciprocalEndMarkingsType);
        obj.put("reciprocalEndMarkingsCondition", reciprocalEndMarkingsCondition);
        obj.put("reciprocalEndPhysicalLat", reciprocalEndPhysicalLat);
        obj.put("reciprocalEndPhysicalLatS", reciprocalEndPhysicalLatS);
        obj.put("reciprocalEndPhysicalLong", reciprocalEndPhysicalLong);
        obj.put("reciprocalEndPhysicalLongS", reciprocalEndPhysicalLongS);
        obj.put("reciprocalEndPhysicalElevation",reciprocalEndPhysicalElevation );
        obj.put("reciprocalEndCrossingHeight", reciprocalEndCrossingHeight);
        obj.put("reciprocalEndGlidePathAngle", reciprocalEndGlidePathAngle);
        obj.put("reciprocalEndDisplacedLat", reciprocalEndDisplacedLat);
        obj.put("reciprocalEndDisplacedLatS", reciprocalEndDisplacedLatS);
        obj.put("reciprocalEndDisplacedLong", reciprocalEndDisplacedLong);
        obj.put("reciprocalEndDisplacedLongS", reciprocalEndDisplacedLongS);
        obj.put("reciprocalEndDisplacedElevation", reciprocalEndDisplacedElevation);
        obj.put("reciprocalEndDisplacedLength",reciprocalEndDisplacedLength);
        obj.put("reciprocalEndTDZElevation", reciprocalEndTDZElevation);
        obj.put("reciprocalEndVASI", reciprocalEndVASI);
        obj.put("reciprocalEndRVR", reciprocalEndRVR);
        obj.put("reciprocalEndRVV", reciprocalEndRVV);
        obj.put("reciprocalEndALS", reciprocalEndALS);
        obj.put("reciprocalEndREIL", reciprocalEndREIL);
        obj.put("reciprocalEndCenterlineLights", reciprocalEndCenterlineLights);
        obj.put("reciprocalEndTouchdownLights", reciprocalEndTouchdownLights);
        obj.put("reciprocalEndObjectDescription", reciprocalEndObjectDescription);
        obj.put("reciprocalEndObjectMarkLight", reciprocalEndObjectMarkLight);
        obj.put("reciprocalEndPart77Category", reciprocalEndPart77Category);
        obj.put("reciprocalEndObjectClearSlope", reciprocalEndObjectClearSlope);
        obj.put("reciprocalEndObjectHeight", reciprocalEndObjectHeight);
        obj.put("reciprocalEndObjectDistance", reciprocalEndObjectDistance);
        obj.put("reciprocalEndObjectOffset", reciprocalEndObjectOffset);
        obj.put("runwayLengthSource", runwayLengthSource);
        obj.put("runwayLengthSourceDate", runwayLengthSourceDate);
        obj.put("runwayWeightBearingCapacitySW", runwayWeightBearingCapacitySW);
        obj.put("runwayWeightBearingCapacityDW", runwayWeightBearingCapacityDW);
        obj.put("runwayWeightBearingCapacityDT", runwayWeightBearingCapacityDT);
        obj.put("runwayWeightBearingCapacityDDT", runwayWeightBearingCapacityDDT);
        obj.put("baseEndGradient", baseEndGradient);
        obj.put("baseEndGradientDirection", baseEndGradientDirection);
        obj.put("baseEndPositionSource", baseEndPositionSource);
        obj.put("baseEndPositionSourceDate",baseEndPositionSourceDate );
        obj.put("baseEndElevationSource", baseEndElevationSource);
        obj.put("baseEndElevationSourceDate", baseEndElevationSourceDate);
        obj.put("baseEndDisplacedThresholdPositionSource", baseEndDisplacedThresholdPositionSource);
        obj.put("baseEndDisplacedThresholdPositionSourceDate", baseEndDisplacedThresholdPositionSourceDate);
        obj.put("baseEndDisplacedThresholdElevationSource", baseEndDisplacedThresholdElevationSource);
        obj.put("baseEndDisplacedThresholdElevationSourceDate", baseEndDisplacedThresholdElevationSourceDate);
        obj.put("baseEndTouchdownZoneElevationSource", baseEndTouchdownZoneElevationSource);
        obj.put("baseEndTouchdownZoneElevationSourceDate", baseEndTouchdownZoneElevationSourceDate);
        obj.put("baseEndTakeOffRunAvailableTORA", baseEndTakeOffRunAvailableTORA);
        obj.put("baseEndTakeOffDistanceAvailableTODA", baseEndTakeOffDistanceAvailableTODA);
        obj.put("baseEndAcltStopDistanceAvailableASDA", baseEndAcltStopDistanceAvailableASDA);
        obj.put("baseEndLandingDistanceAvailableLDA", baseEndLandingDistanceAvailableLDA);
        obj.put("baseEndLandingDistanceAvailableLAHSO", baseEndLandingDistanceAvailableLAHSO);
        obj.put("baseEndLandingDistanceAvailableLAHSOIntRwyID", baseEndLandingDistanceAvailableLAHSOIntRwyID);
        obj.put("baseEndLandingDistanceAvailableLAHSOIntEntityDesc", baseEndLandingDistanceAvailableLAHSOIntEntityDesc);
        obj.put("baseEndLandingDistanceAvailableLAHSOHldPtLatitude", baseEndLandingDistanceAvailableLAHSOHldPtLatitude);
        obj.put("baseEndLandingDistanceAvailableLAHSOHldPtLatitudeS", baseEndLandingDistanceAvailableLAHSOHldPtLatitudeS);
        obj.put("baseEndLandingDistanceAvailableLAHSOHldPtLongitude", baseEndLandingDistanceAvailableLAHSOHldPtLongitude);
        obj.put("baseEndLandingDistanceAvailableLAHSOHldPtLongitudeS",baseEndLandingDistanceAvailableLAHSOHldPtLongitudeS);
        obj.put("baseEndLandingDistanceAvailableLAHSOCoordSrc", baseEndLandingDistanceAvailableLAHSOCoordSrc);
        obj.put("baseEndLandingDistanceAvailableLAHSOCoordSrcDate", baseEndLandingDistanceAvailableLAHSOCoordSrcDate);
        obj.put("reciprocalEndGradient", reciprocalEndGradient);
        obj.put("reciprocalEndGradientDirection", reciprocalEndGradientDirection);
        obj.put("reciprocalEndPositionSource", reciprocalEndPositionSource);
        obj.put("reciprocalEndPositionSourceDate", reciprocalEndPositionSourceDate);
        obj.put("reciprocalEndElevationSource", reciprocalEndElevationSource);
        obj.put("reciprocalEndElevationSourceDate", reciprocalEndElevationSourceDate);
        obj.put("reciprocalEndDisplacedThresholdPositionSource", reciprocalEndDisplacedThresholdPositionSource);
        obj.put("reciprocalEndDisplacedThresholdPositionSourceDate", reciprocalEndDisplacedThresholdPositionSourceDate);
        obj.put("reciprocalEndDisplacedThresholdElevationSource", reciprocalEndDisplacedThresholdElevationSource);
        obj.put("reciprocalEndDisplacedThresholdElevationSourceDate", reciprocalEndDisplacedThresholdElevationSourceDate);
        obj.put("reciprocalEndTouchdownZoneElevationSource", reciprocalEndTouchdownZoneElevationSource);
        obj.put("reciprocalEndTouchdownZoneElevationSourceDate", reciprocalEndTouchdownZoneElevationSourceDate);
        obj.put("reciprocalEndTakeOffRunAvailableTORA", reciprocalEndTakeOffRunAvailableTORA);
        obj.put("reciprocalEndTakeOffDistanceAvailableTODA",reciprocalEndTakeOffDistanceAvailableTODA);
        obj.put("reciprocalEndAcltStopDistanceAvailableASDA", reciprocalEndAcltStopDistanceAvailableASDA);
        obj.put("reciprocalEndLandingDistanceAvailableLDA", reciprocalEndLandingDistanceAvailableLDA);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSO", reciprocalEndLandingDistanceAvailableLAHSO);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOIntRwyID", reciprocalEndLandingDistanceAvailableLAHSOIntRwyID);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc", reciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude", reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS", reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude", reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS", reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOCoordSrc", reciprocalEndLandingDistanceAvailableLAHSOCoordSrc);
        obj.put("reciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate", reciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate);
        obj.put("lastUpdated", lastUpdated);
        return obj;
    }


    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getRunwayId() {
        return runwayId;
    }

    public void setRunwayId(String runwayId) {
        this.runwayId = runwayId;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    public int getRunwayWidth() {
        return runwayWidth;
    }

    public void setRunwayWidth(int runwayWidth) {
        this.runwayWidth = runwayWidth;
    }

    public String getRunwaySurfaceCond() {
        return runwaySurfaceCond;
    }

    public void setRunwaySurfaceCond(String runwaySurfaceCond) {
        this.runwaySurfaceCond = runwaySurfaceCond;
    }

    public String getRunwaySurfaceTreatment() {
        return runwaySurfaceTreatment;
    }

    public void setRunwaySurfaceTreatment(String runwaySurfaceTreatment) {
        this.runwaySurfaceTreatment = runwaySurfaceTreatment;
    }

    public String getPavementClass() {
        return pavementClass;
    }

    public void setPavementClass(String pavementClass) {
        this.pavementClass = pavementClass;
    }

    public String getEdgeLightsIntensity() {
        return edgeLightsIntensity;
    }

    public void setEdgeLightsIntensity(String edgeLightsIntensity) {
        this.edgeLightsIntensity = edgeLightsIntensity;
    }

    public String getBaseEndId() {
        return baseEndId;
    }

    public void setBaseEndId(String baseEndId) {
        this.baseEndId = baseEndId;
    }

    public int getBaseEndTrueAlignment() {
        return baseEndTrueAlignment;
    }

    public void setBaseEndTrueAlignment(int baseEndTrueAlignment) {
        this.baseEndTrueAlignment = baseEndTrueAlignment;
    }

    public String getBaseEndILSType() {
        return baseEndILSType;
    }

    public void setBaseEndILSType(String baseEndILSType) {
        this.baseEndILSType = baseEndILSType;
    }

    public String getBaseEndRightTrafficPattern() {
        return baseEndRightTrafficPattern;
    }

    public void setBaseEndRightTrafficPattern(String baseEndRightTrafficPattern) {
        this.baseEndRightTrafficPattern = baseEndRightTrafficPattern;
    }

    public String getBaseEndMarkingsType() {
        return baseEndMarkingsType;
    }

    public void setBaseEndMarkingsType(String baseEndMarkingsType) {
        this.baseEndMarkingsType = baseEndMarkingsType;
    }

    public String getBaseEndMarkingsCondition() {
        return baseEndMarkingsCondition;
    }

    public void setBaseEndMarkingsCondition(String baseEndMarkingsCondition) {
        this.baseEndMarkingsCondition = baseEndMarkingsCondition;
    }

    public BigDecimal getBaseEndPhysicalLat() {
        return baseEndPhysicalLat;
    }

    public void setBaseEndPhysicalLat(BigDecimal baseEndPhysicalLat) {
        this.baseEndPhysicalLat = baseEndPhysicalLat;
    }

    public String getBaseEndPhysicalLatS() {
        return baseEndPhysicalLatS;
    }

    public void setBaseEndPhysicalLatS(String baseEndPhysicalLatS) {
        this.baseEndPhysicalLatS = baseEndPhysicalLatS;
    }

    public BigDecimal getBaseEndPhysicalLong() {
        return baseEndPhysicalLong;
    }

    public void setBaseEndPhysicalLong(BigDecimal baseEndPhysicalLong) {
        this.baseEndPhysicalLong = baseEndPhysicalLong;
    }

    public String getBaseEndPhysicalLongS() {
        return baseEndPhysicalLongS;
    }

    public void setBaseEndPhysicalLongS(String baseEndPhysicalLongS) {
        this.baseEndPhysicalLongS = baseEndPhysicalLongS;
    }

    public BigDecimal getBaseEndPhysicalElevation() {
        return baseEndPhysicalElevation;
    }

    public void setBaseEndPhysicalElevation(BigDecimal baseEndPhysicalElevation) {
        this.baseEndPhysicalElevation = baseEndPhysicalElevation;
    }

    public BigDecimal getBaseEndCrossingHeight() {
        return baseEndCrossingHeight;
    }

    public void setBaseEndCrossingHeight(BigDecimal baseEndCrossingHeight) {
        this.baseEndCrossingHeight = baseEndCrossingHeight;
    }

    public BigDecimal getBaseEndGlidePathAngle() {
        return baseEndGlidePathAngle;
    }

    public void setBaseEndGlidePathAngle(BigDecimal baseEndGlidePathAngle) {
        this.baseEndGlidePathAngle = baseEndGlidePathAngle;
    }

    public BigDecimal getBaseEndDisplacedLat() {
        return baseEndDisplacedLat;
    }

    public void setBaseEndDisplacedLat(BigDecimal baseEndDisplacedLat) {
        this.baseEndDisplacedLat = baseEndDisplacedLat;
    }

    public String getBaseEndDisplacedLatS() {
        return baseEndDisplacedLatS;
    }

    public void setBaseEndDisplacedLatS(String baseEndDisplacedLatS) {
        this.baseEndDisplacedLatS = baseEndDisplacedLatS;
    }

    public BigDecimal getBaseEndDisplacedLong() {
        return baseEndDisplacedLong;
    }

    public void setBaseEndDisplacedLong(BigDecimal baseEndDisplacedLong) {
        this.baseEndDisplacedLong = baseEndDisplacedLong;
    }

    public String getBaseEndDisplacedLongS() {
        return baseEndDisplacedLongS;
    }

    public void setBaseEndDisplacedLongS(String baseEndDisplacedLongS) {
        this.baseEndDisplacedLongS = baseEndDisplacedLongS;
    }

    public BigDecimal getBaseEndDisplacedElevation() {
        return baseEndDisplacedElevation;
    }

    public void setBaseEndDisplacedElevation(BigDecimal baseEndDisplacedElevation) {
        this.baseEndDisplacedElevation = baseEndDisplacedElevation;
    }

    public BigDecimal getBaseEndDisplacedLength() {
        return baseEndDisplacedLength;
    }

    public void setBaseEndDisplacedLength(BigDecimal baseEndDisplacedLength) {
        this.baseEndDisplacedLength = baseEndDisplacedLength;
    }

    public BigDecimal getBaseEndTDZElevation() {
        return baseEndTDZElevation;
    }

    public void setBaseEndTDZElevation(BigDecimal baseEndTDZElevation) {
        this.baseEndTDZElevation = baseEndTDZElevation;
    }

    public String getBaseEndVASI() {
        return baseEndVASI;
    }

    public void setBaseEndVASI(String baseEndVASI) {
        this.baseEndVASI = baseEndVASI;
    }

    public String getBaseEndRVR() {
        return baseEndRVR;
    }

    public void setBaseEndRVR(String baseEndRVR) {
        this.baseEndRVR = baseEndRVR;
    }

    public String getBaseEndRVV() {
        return baseEndRVV;
    }

    public void setBaseEndRVV(String baseEndRVV) {
        this.baseEndRVV = baseEndRVV;
    }

    public String getBaseEndALS() {
        return baseEndALS;
    }

    public void setBaseEndALS(String baseEndALS) {
        this.baseEndALS = baseEndALS;
    }

    public String getBaseEndREIL() {
        return baseEndREIL;
    }

    public void setBaseEndREIL(String baseEndREIL) {
        this.baseEndREIL = baseEndREIL;
    }

    public String getBaseEndCenterlineLights() {
        return baseEndCenterlineLights;
    }

    public void setBaseEndCenterlineLights(String baseEndCenterlineLights) {
        this.baseEndCenterlineLights = baseEndCenterlineLights;
    }

    public String getBaseEndTouchdownLights() {
        return baseEndTouchdownLights;
    }

    public void setBaseEndTouchdownLights(String baseEndTouchdownLights) {
        this.baseEndTouchdownLights = baseEndTouchdownLights;
    }

    public String getBaseEndObjectDesc() {
        return baseEndObjectDesc;
    }

    public void setBaseEndObjectDesc(String baseEndObjectDesc) {
        this.baseEndObjectDesc = baseEndObjectDesc;
    }

    public String getBaseEndObjectMarkLight() {
        return baseEndObjectMarkLight;
    }

    public void setBaseEndObjectMarkLight(String baseEndObjectMarkLight) {
        this.baseEndObjectMarkLight = baseEndObjectMarkLight;
    }

    public String getBaseEndPart77Category() {
        return baseEndPart77Category;
    }

    public void setBaseEndPart77Category(String baseEndPart77Category) {
        this.baseEndPart77Category = baseEndPart77Category;
    }

    public BigDecimal getBaseEndObjectClearSlope() {
        return baseEndObjectClearSlope;
    }

    public void setBaseEndObjectClearSlope(BigDecimal baseEndObjectClearSlope) {
        this.baseEndObjectClearSlope = baseEndObjectClearSlope;
    }

    public BigDecimal getBaseEndObjectHeight() {
        return baseEndObjectHeight;
    }

    public void setBaseEndObjectHeight(BigDecimal baseEndObjectHeight) {
        this.baseEndObjectHeight = baseEndObjectHeight;
    }

    public BigDecimal getBaseEndObjectDistance() {
        return baseEndObjectDistance;
    }

    public void setBaseEndObjectDistance(BigDecimal baseEndObjectDistance) {
        this.baseEndObjectDistance = baseEndObjectDistance;
    }

    public String getBaseEndObjectOffset() {
        return baseEndObjectOffset;
    }

    public void setBaseEndObjectOffset(String baseEndObjectOffset) {
        this.baseEndObjectOffset = baseEndObjectOffset;
    }

    public String getReciprocalEndID() {
        return reciprocalEndID;
    }

    public void setReciprocalEndID(String reciprocalEndID) {
        this.reciprocalEndID = reciprocalEndID;
    }

    public int getReciprocalEndTrueAlignment() {
        return reciprocalEndTrueAlignment;
    }

    public void setReciprocalEndTrueAlignment(int reciprocalEndTrueAlignment) {
        this.reciprocalEndTrueAlignment = reciprocalEndTrueAlignment;
    }

    public String getRecipricolEndILSType() {
        return recipricolEndILSType;
    }

    public void setRecipricolEndILSType(String recipricolEndILSType) {
        this.recipricolEndILSType = recipricolEndILSType;
    }

    public String getReciprocalEndRightTrafficPattern() {
        return reciprocalEndRightTrafficPattern;
    }

    public void setReciprocalEndRightTrafficPattern(String reciprocalEndRightTrafficPattern) {
        this.reciprocalEndRightTrafficPattern = reciprocalEndRightTrafficPattern;
    }

    public String getReciprocalEndMarkingsType() {
        return reciprocalEndMarkingsType;
    }

    public void setReciprocalEndMarkingsType(String reciprocalEndMarkingsType) {
        this.reciprocalEndMarkingsType = reciprocalEndMarkingsType;
    }

    public String getReciprocalEndMarkingsCondition() {
        return reciprocalEndMarkingsCondition;
    }

    public void setReciprocalEndMarkingsCondition(String reciprocalEndMarkingsCondition) {
        this.reciprocalEndMarkingsCondition = reciprocalEndMarkingsCondition;
    }

    public BigDecimal getReciprocalEndPhysicalLat() {
        return reciprocalEndPhysicalLat;
    }

    public void setReciprocalEndPhysicalLat(BigDecimal reciprocalEndPhysicalLat) {
        this.reciprocalEndPhysicalLat = reciprocalEndPhysicalLat;
    }

    public String getReciprocalEndPhysicalLatS() {
        return reciprocalEndPhysicalLatS;
    }

    public void setReciprocalEndPhysicalLatS(String reciprocalEndPhysicalLatS) {
        this.reciprocalEndPhysicalLatS = reciprocalEndPhysicalLatS;
    }

    public BigDecimal getReciprocalEndPhysicalLong() {
        return reciprocalEndPhysicalLong;
    }

    public void setReciprocalEndPhysicalLong(BigDecimal reciprocalEndPhysicalLong) {
        this.reciprocalEndPhysicalLong = reciprocalEndPhysicalLong;
    }

    public String getReciprocalEndPhysicalLongS() {
        return reciprocalEndPhysicalLongS;
    }

    public void setReciprocalEndPhysicalLongS(String reciprocalEndPhysicalLongS) {
        this.reciprocalEndPhysicalLongS = reciprocalEndPhysicalLongS;
    }

    public BigDecimal getReciprocalEndPhysicalElevation() {
        return reciprocalEndPhysicalElevation;
    }

    public void setReciprocalEndPhysicalElevation(BigDecimal reciprocalEndPhysicalElevation) {
        this.reciprocalEndPhysicalElevation = reciprocalEndPhysicalElevation;
    }

    public BigDecimal getReciprocalEndCrossingHeight() {
        return reciprocalEndCrossingHeight;
    }

    public void setReciprocalEndCrossingHeight(BigDecimal reciprocalEndCrossingHeight) {
        this.reciprocalEndCrossingHeight = reciprocalEndCrossingHeight;
    }

    public BigDecimal getReciprocalEndGlidePathAngle() {
        return reciprocalEndGlidePathAngle;
    }

    public void setReciprocalEndGlidePathAngle(BigDecimal reciprocalEndGlidePathAngle) {
        this.reciprocalEndGlidePathAngle = reciprocalEndGlidePathAngle;
    }

    public BigDecimal getReciprocalEndDisplacedLat() {
        return reciprocalEndDisplacedLat;
    }

    public void setReciprocalEndDisplacedLat(BigDecimal reciprocalEndDisplacedLat) {
        this.reciprocalEndDisplacedLat = reciprocalEndDisplacedLat;
    }

    public String getReciprocalEndDisplacedLatS() {
        return reciprocalEndDisplacedLatS;
    }

    public void setReciprocalEndDisplacedLatS(String reciprocalEndDisplacedLatS) {
        this.reciprocalEndDisplacedLatS = reciprocalEndDisplacedLatS;
    }

    public BigDecimal getReciprocalEndDisplacedLong() {
        return reciprocalEndDisplacedLong;
    }

    public void setReciprocalEndDisplacedLong(BigDecimal reciprocalEndDisplacedLong) {
        this.reciprocalEndDisplacedLong = reciprocalEndDisplacedLong;
    }

    public String getReciprocalEndDisplacedLongS() {
        return reciprocalEndDisplacedLongS;
    }

    public void setReciprocalEndDisplacedLongS(String reciprocalEndDisplacedLongS) {
        this.reciprocalEndDisplacedLongS = reciprocalEndDisplacedLongS;
    }

//    public BigDecimal getReciprocalEndDisplacedTDZElevation() {
//        return reciprocalEndDisplacedTDZElevation;
//    }
//
//    public void setReciprocalEndDisplacedTDZElevation(BigDecimal reciprocalEndDisplacedTDZElevation) {
//        this.reciprocalEndDisplacedTDZElevation = reciprocalEndDisplacedTDZElevation;
//    }

    public BigDecimal getReciprocalEndDisplacedLength() {
        return reciprocalEndDisplacedLength;
    }

    public void setReciprocalEndDisplacedLength(BigDecimal reciprocalEndDisplacedLength) {
        this.reciprocalEndDisplacedLength = reciprocalEndDisplacedLength;
    }

    public BigDecimal getReciprocalEndTDZElevation() {
        return reciprocalEndTDZElevation;
    }

    public void setReciprocalEndTDZElevation(BigDecimal reciprocalEndTDZElevation) {
        this.reciprocalEndTDZElevation = reciprocalEndTDZElevation;
    }

    public String getReciprocalEndVASI() {
        return reciprocalEndVASI;
    }

    public void setReciprocalEndVASI(String reciprocalEndVASI) {
        this.reciprocalEndVASI = reciprocalEndVASI;
    }

    public String getReciprocalEndRVR() {
        return reciprocalEndRVR;
    }

    public void setReciprocalEndRVR(String reciprocalEndRVR) {
        this.reciprocalEndRVR = reciprocalEndRVR;
    }

    public String getReciprocalEndRVV() {
        return reciprocalEndRVV;
    }

    public void setReciprocalEndRVV(String reciprocalEndRVV) {
        this.reciprocalEndRVV = reciprocalEndRVV;
    }

    public String getReciprocalEndALS() {
        return reciprocalEndALS;
    }

    public void setReciprocalEndALS(String reciprocalEndALS) {
        this.reciprocalEndALS = reciprocalEndALS;
    }

    public String getReciprocalEndREIL() {
        return reciprocalEndREIL;
    }

    public void setReciprocalEndREIL(String reciprocalEndREIL) {
        this.reciprocalEndREIL = reciprocalEndREIL;
    }

    public String getReciprocalEndCenterlineLights() {
        return reciprocalEndCenterlineLights;
    }

    public void setReciprocalEndCenterlineLights(String reciprocalEndCenterlineLights) {
        this.reciprocalEndCenterlineLights = reciprocalEndCenterlineLights;
    }

    public String getReciprocalEndTouchdownLights() {
        return reciprocalEndTouchdownLights;
    }

    public void setReciprocalEndTouchdownLights(String reciprocalEndTouchdownLights) {
        this.reciprocalEndTouchdownLights = reciprocalEndTouchdownLights;
    }

    public String getReciprocalEndObjectDescription() {
        return reciprocalEndObjectDescription;
    }

    public void setReciprocalEndObjectDescription(String reciprocalEndObjectDescription) {
        this.reciprocalEndObjectDescription = reciprocalEndObjectDescription;
    }

    public String getReciprocalEndObjectMarkLight() {
        return reciprocalEndObjectMarkLight;
    }

    public void setReciprocalEndObjectMarkLight(String reciprocalEndObjectMarkLight) {
        this.reciprocalEndObjectMarkLight = reciprocalEndObjectMarkLight;
    }

    public String getReciprocalEndPart77Category() {
        return reciprocalEndPart77Category;
    }

    public void setReciprocalEndPart77Category(String reciprocalEndPart77Category) {
        this.reciprocalEndPart77Category = reciprocalEndPart77Category;
    }

    public BigDecimal getReciprocalEndObjectClearSlope() {
        return reciprocalEndObjectClearSlope;
    }

    public void setReciprocalEndObjectClearSlope(BigDecimal reciprocalEndObjectClearSlope) {
        this.reciprocalEndObjectClearSlope = reciprocalEndObjectClearSlope;
    }

    public BigDecimal getReciprocalEndObjectHeight() {
        return reciprocalEndObjectHeight;
    }

    public void setReciprocalEndObjectHeight(BigDecimal reciprocalEndObjectHeight) {
        this.reciprocalEndObjectHeight = reciprocalEndObjectHeight;
    }

    public BigDecimal getReciprocalEndObjectDistance() {
        return reciprocalEndObjectDistance;
    }

    public void setReciprocalEndObjectDistance(BigDecimal reciprocalEndObjectDistance) {
        this.reciprocalEndObjectDistance = reciprocalEndObjectDistance;
    }

    public String getReciprocalEndObjectOffset() {
        return reciprocalEndObjectOffset;
    }

    public void setReciprocalEndObjectOffset(String reciprocalEndObjectOffset) {
        this.reciprocalEndObjectOffset = reciprocalEndObjectOffset;
    }

    public String getRunwayLengthSource() {
        return runwayLengthSource;
    }

    public void setRunwayLengthSource(String runwayLengthSource) {
        this.runwayLengthSource = runwayLengthSource;
    }

    public Date getRunwayLengthSourceDate() {
        return runwayLengthSourceDate;
    }

    public void setRunwayLengthSourceDate(Date runwayLengthSourceDate) {
        this.runwayLengthSourceDate = runwayLengthSourceDate;
    }

    public BigDecimal getRunwayWeightBearingCapacitySW() {
        return runwayWeightBearingCapacitySW;
    }

    public void setRunwayWeightBearingCapacitySW(BigDecimal runwayWeightBearingCapacitySW) {
        this.runwayWeightBearingCapacitySW = runwayWeightBearingCapacitySW;
    }

    public BigDecimal getRunwayWeightBearingCapacityDW() {
        return runwayWeightBearingCapacityDW;
    }

    public void setRunwayWeightBearingCapacityDW(BigDecimal runwayWeightBearingCapacityDW) {
        this.runwayWeightBearingCapacityDW = runwayWeightBearingCapacityDW;
    }

    public BigDecimal getRunwayWeightBearingCapacityDT() {
        return runwayWeightBearingCapacityDT;
    }

    public void setRunwayWeightBearingCapacityDT(BigDecimal runwayWeightBearingCapacityDT) {
        this.runwayWeightBearingCapacityDT = runwayWeightBearingCapacityDT;
    }

    public BigDecimal getRunwayWeightBearingCapacityDDT() {
        return runwayWeightBearingCapacityDDT;
    }

    public void setRunwayWeightBearingCapacityDDT(BigDecimal runwayWeightBearingCapacityDDT) {
        this.runwayWeightBearingCapacityDDT = runwayWeightBearingCapacityDDT;
    }

    public int getBaseEndGradient() {
        return baseEndGradient;
    }

    public void setBaseEndGradient(int baseEndGradient) {
        this.baseEndGradient = baseEndGradient;
    }

    public String getBaseEndGradientDirection() {
        return baseEndGradientDirection;
    }

    public void setBaseEndGradientDirection(String baseEndGradientDirection) {
        this.baseEndGradientDirection = baseEndGradientDirection;
    }

    public String getBaseEndPositionSource() {
        return baseEndPositionSource;
    }

    public void setBaseEndPositionSource(String baseEndPositionSource) {
        this.baseEndPositionSource = baseEndPositionSource;
    }

    public Date getBaseEndPositionSourceDate() {
        return baseEndPositionSourceDate;
    }

    public void setBaseEndPositionSourceDate(Date baseEndPositionSourceDate) {
        this.baseEndPositionSourceDate = baseEndPositionSourceDate;
    }

    public String getBaseEndElevationSource() {
        return baseEndElevationSource;
    }

    public void setBaseEndElevationSource(String baseEndElevationSource) {
        this.baseEndElevationSource = baseEndElevationSource;
    }

    public Date getBaseEndElevationSourceDate() {
        return baseEndElevationSourceDate;
    }

    public void setBaseEndElevationSourceDate(Date baseEndElevationSourceDate) {
        this.baseEndElevationSourceDate = baseEndElevationSourceDate;
    }

    public String getBaseEndDisplacedThresholdPositionSource() {
        return baseEndDisplacedThresholdPositionSource;
    }

    public void setBaseEndDisplacedThresholdPositionSource(String baseEndDisplacedThresholdPositionSource) {
        this.baseEndDisplacedThresholdPositionSource = baseEndDisplacedThresholdPositionSource;
    }

    public Date getBaseEndDisplacedThresholdPositionSourceDate() {
        return baseEndDisplacedThresholdPositionSourceDate;
    }

    public void setBaseEndDisplacedThresholdPositionSourceDate(Date baseEndDisplacedThresholdPositionSourceDate) {
        this.baseEndDisplacedThresholdPositionSourceDate = baseEndDisplacedThresholdPositionSourceDate;
    }

    public String getBaseEndDisplacedThresholdElevationSource() {
        return baseEndDisplacedThresholdElevationSource;
    }

    public void setBaseEndDisplacedThresholdElevationSource(String baseEndDisplacedThresholdElevationSource) {
        this.baseEndDisplacedThresholdElevationSource = baseEndDisplacedThresholdElevationSource;
    }

    public Date getBaseEndDisplacedThresholdElevationSourceDate() {
        return baseEndDisplacedThresholdElevationSourceDate;
    }

    public void setBaseEndDisplacedThresholdElevationSourceDate(Date baseEndDisplacedThresholdElevationSourceDate) {
        this.baseEndDisplacedThresholdElevationSourceDate = baseEndDisplacedThresholdElevationSourceDate;
    }

    public String getBaseEndTouchdownZoneElevationSource() {
        return baseEndTouchdownZoneElevationSource;
    }

    public void setBaseEndTouchdownZoneElevationSource(String baseEndTouchdownZoneElevationSource) {
        this.baseEndTouchdownZoneElevationSource = baseEndTouchdownZoneElevationSource;
    }

    public Date getBaseEndTouchdownZoneElevationSourceDate() {
        return baseEndTouchdownZoneElevationSourceDate;
    }

    public void setBaseEndTouchdownZoneElevationSourceDate(Date baseEndTouchdownZoneElevationSourceDate) {
        this.baseEndTouchdownZoneElevationSourceDate = baseEndTouchdownZoneElevationSourceDate;
    }

    public int getBaseEndTakeOffRunAvailableTORA() {
        return baseEndTakeOffRunAvailableTORA;
    }

    public void setBaseEndTakeOffRunAvailableTORA(int baseEndTakeOffRunAvailableTORA) {
        this.baseEndTakeOffRunAvailableTORA = baseEndTakeOffRunAvailableTORA;
    }

    public int getBaseEndTakeOffDistanceAvailableTODA() {
        return baseEndTakeOffDistanceAvailableTODA;
    }

    public void setBaseEndTakeOffDistanceAvailableTODA(int baseEndTakeOffDistanceAvailableTODA) {
        this.baseEndTakeOffDistanceAvailableTODA = baseEndTakeOffDistanceAvailableTODA;
    }

    public int getBaseEndAcltStopDistanceAvailableASDA() {
        return baseEndAcltStopDistanceAvailableASDA;
    }

    public void setBaseEndAcltStopDistanceAvailableASDA(int baseEndAcltStopDistanceAvailableASDA) {
        this.baseEndAcltStopDistanceAvailableASDA = baseEndAcltStopDistanceAvailableASDA;
    }

    public int getBaseEndLandingDistanceAvailableLDA() {
        return baseEndLandingDistanceAvailableLDA;
    }

    public void setBaseEndLandingDistanceAvailableLDA(int baseEndLandingDistanceAvailableLDA) {
        this.baseEndLandingDistanceAvailableLDA = baseEndLandingDistanceAvailableLDA;
    }

    public int getBaseEndLandingDistanceAvailableLAHSO() {
        return baseEndLandingDistanceAvailableLAHSO;
    }

    public void setBaseEndLandingDistanceAvailableLAHSO(int baseEndLandingDistanceAvailableLAHSO) {
        this.baseEndLandingDistanceAvailableLAHSO = baseEndLandingDistanceAvailableLAHSO;
    }

    public String getBaseEndLandingDistanceAvailableLAHSOIntRwyID() {
        return baseEndLandingDistanceAvailableLAHSOIntRwyID;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOIntRwyID(String baseEndLandingDistanceAvailableLAHSOIntRwyID) {
        this.baseEndLandingDistanceAvailableLAHSOIntRwyID = baseEndLandingDistanceAvailableLAHSOIntRwyID;
    }

    public String getBaseEndLandingDistanceAvailableLAHSOIntEntityDesc() {
        return baseEndLandingDistanceAvailableLAHSOIntEntityDesc;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOIntEntityDesc(String baseEndLandingDistanceAvailableLAHSOIntEntityDesc) {
        this.baseEndLandingDistanceAvailableLAHSOIntEntityDesc = baseEndLandingDistanceAvailableLAHSOIntEntityDesc;
    }

    public BigDecimal getBaseEndLandingDistanceAvailableLAHSOHldPtLatitude() {
        return baseEndLandingDistanceAvailableLAHSOHldPtLatitude;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOHldPtLatitude(BigDecimal baseEndLandingDistanceAvailableLAHSOHldPtLatitude) {
        this.baseEndLandingDistanceAvailableLAHSOHldPtLatitude = baseEndLandingDistanceAvailableLAHSOHldPtLatitude;
    }

    public String getBaseEndLandingDistanceAvailableLAHSOHldPtLatitudeS() {
        return baseEndLandingDistanceAvailableLAHSOHldPtLatitudeS;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOHldPtLatitudeS(String baseEndLandingDistanceAvailableLAHSOHldPtLatitudeS) {
        this.baseEndLandingDistanceAvailableLAHSOHldPtLatitudeS = baseEndLandingDistanceAvailableLAHSOHldPtLatitudeS;
    }

    public BigDecimal getBaseEndLandingDistanceAvailableLAHSOHldPtLongitude() {
        return baseEndLandingDistanceAvailableLAHSOHldPtLongitude;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOHldPtLongitude(BigDecimal baseEndLandingDistanceAvailableLAHSOHldPtLongitude) {
        this.baseEndLandingDistanceAvailableLAHSOHldPtLongitude = baseEndLandingDistanceAvailableLAHSOHldPtLongitude;
    }

    public String getBaseEndLandingDistanceAvailableLAHSOHldPtLongitudeS() {
        return baseEndLandingDistanceAvailableLAHSOHldPtLongitudeS;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOHldPtLongitudeS(String baseEndLandingDistanceAvailableLAHSOHldPtLongitudeS) {
        this.baseEndLandingDistanceAvailableLAHSOHldPtLongitudeS = baseEndLandingDistanceAvailableLAHSOHldPtLongitudeS;
    }

    public String getBaseEndLandingDistanceAvailableLAHSOCoordSrc() {
        return baseEndLandingDistanceAvailableLAHSOCoordSrc;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOCoordSrc(String baseEndLandingDistanceAvailableLAHSOCoordSrc) {
        this.baseEndLandingDistanceAvailableLAHSOCoordSrc = baseEndLandingDistanceAvailableLAHSOCoordSrc;
    }

    public String getBaseEndLandingDistanceAvailableLAHSOCoordSrcDate() {
        return baseEndLandingDistanceAvailableLAHSOCoordSrcDate;
    }

    public void setBaseEndLandingDistanceAvailableLAHSOCoordSrcDate(String baseEndLandingDistanceAvailableLAHSOCoordSrcDate) {
        this.baseEndLandingDistanceAvailableLAHSOCoordSrcDate = baseEndLandingDistanceAvailableLAHSOCoordSrcDate;
    }

    public String getReciprocalEndGradient() {
        return reciprocalEndGradient;
    }

    public void setReciprocalEndGradient(String reciprocalEndGradient) {
        this.reciprocalEndGradient = reciprocalEndGradient;
    }

    public String getReciprocalEndGradientDirection() {
        return reciprocalEndGradientDirection;
    }

    public void setReciprocalEndGradientDirection(String reciprocalEndGradientDirection) {
        this.reciprocalEndGradientDirection = reciprocalEndGradientDirection;
    }

    public String getReciprocalEndPositionSource() {
        return reciprocalEndPositionSource;
    }

    public void setReciprocalEndPositionSource(String reciprocalEndPositionSource) {
        this.reciprocalEndPositionSource = reciprocalEndPositionSource;
    }

    public Date getReciprocalEndPositionSourceDate() {
        return reciprocalEndPositionSourceDate;
    }

    public void setReciprocalEndPositionSourceDate(Date reciprocalEndPositionSourceDate) {
        this.reciprocalEndPositionSourceDate = reciprocalEndPositionSourceDate;
    }

    public String getReciprocalEndElevationSource() {
        return reciprocalEndElevationSource;
    }

    public void setReciprocalEndElevationSource(String reciprocalEndElevationSource) {
        this.reciprocalEndElevationSource = reciprocalEndElevationSource;
    }

    public Date getReciprocalEndElevationSourceDate() {
        return reciprocalEndElevationSourceDate;
    }

    public void setReciprocalEndElevationSourceDate(Date reciprocalEndElevationSourceDate) {
        this.reciprocalEndElevationSourceDate = reciprocalEndElevationSourceDate;
    }

    public String getReciprocalEndDisplacedThresholdPositionSource() {
        return reciprocalEndDisplacedThresholdPositionSource;
    }

    public void setReciprocalEndDisplacedThresholdPositionSource(String reciprocalEndDisplacedThresholdPositionSource) {
        this.reciprocalEndDisplacedThresholdPositionSource = reciprocalEndDisplacedThresholdPositionSource;
    }

    public Date getReciprocalEndDisplacedThresholdPositionSourceDate() {
        return reciprocalEndDisplacedThresholdPositionSourceDate;
    }

    public void setReciprocalEndDisplacedThresholdPositionSourceDate(Date reciprocalEndDisplacedThresholdPositionSourceDate) {
        this.reciprocalEndDisplacedThresholdPositionSourceDate = reciprocalEndDisplacedThresholdPositionSourceDate;
    }

    public String getReciprocalEndDisplacedThresholdElevationSource() {
        return reciprocalEndDisplacedThresholdElevationSource;
    }

    public void setReciprocalEndDisplacedThresholdElevationSource(String reciprocalEndDisplacedThresholdElevationSource) {
        this.reciprocalEndDisplacedThresholdElevationSource = reciprocalEndDisplacedThresholdElevationSource;
    }

    public Date getReciprocalEndDisplacedThresholdElevationSourceDate() {
        return reciprocalEndDisplacedThresholdElevationSourceDate;
    }

    public void setReciprocalEndDisplacedThresholdElevationSourceDate(Date reciprocalEndDisplacedThresholdElevationSourceDate) {
        this.reciprocalEndDisplacedThresholdElevationSourceDate = reciprocalEndDisplacedThresholdElevationSourceDate;
    }

    public String getReciprocalEndTouchdownZoneElevationSource() {
        return reciprocalEndTouchdownZoneElevationSource;
    }

    public void setReciprocalEndTouchdownZoneElevationSource(String reciprocalEndTouchdownZoneElevationSource) {
        this.reciprocalEndTouchdownZoneElevationSource = reciprocalEndTouchdownZoneElevationSource;
    }

    public Date getReciprocalEndTouchdownZoneElevationSourceDate() {
        return reciprocalEndTouchdownZoneElevationSourceDate;
    }

    public void setReciprocalEndTouchdownZoneElevationSourceDate(Date reciprocalEndTouchdownZoneElevationSourceDate) {
        this.reciprocalEndTouchdownZoneElevationSourceDate = reciprocalEndTouchdownZoneElevationSourceDate;
    }

    public int getReciprocalEndTakeOffRunAvailableTORA() {
        return reciprocalEndTakeOffRunAvailableTORA;
    }

    public void setReciprocalEndTakeOffRunAvailableTORA(int reciprocalEndTakeOffRunAvailableTORA) {
        this.reciprocalEndTakeOffRunAvailableTORA = reciprocalEndTakeOffRunAvailableTORA;
    }

    public int getReciprocalEndTakeOffDistanceAvailableTODA() {
        return reciprocalEndTakeOffDistanceAvailableTODA;
    }

    public void setReciprocalEndTakeOffDistanceAvailableTODA(int reciprocalEndTakeOffDistanceAvailableTODA) {
        this.reciprocalEndTakeOffDistanceAvailableTODA = reciprocalEndTakeOffDistanceAvailableTODA;
    }

    public int getReciprocalEndAcltStopDistanceAvailableASDA() {
        return reciprocalEndAcltStopDistanceAvailableASDA;
    }

    public void setReciprocalEndAcltStopDistanceAvailableASDA(int reciprocalEndAcltStopDistanceAvailableASDA) {
        this.reciprocalEndAcltStopDistanceAvailableASDA = reciprocalEndAcltStopDistanceAvailableASDA;
    }

    public int getReciprocalEndLandingDistanceAvailableLDA() {
        return reciprocalEndLandingDistanceAvailableLDA;
    }

    public void setReciprocalEndLandingDistanceAvailableLDA(int reciprocalEndLandingDistanceAvailableLDA) {
        this.reciprocalEndLandingDistanceAvailableLDA = reciprocalEndLandingDistanceAvailableLDA;
    }

    public int getReciprocalEndLandingDistanceAvailableLAHSO() {
        return reciprocalEndLandingDistanceAvailableLAHSO;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSO(int reciprocalEndLandingDistanceAvailableLAHSO) {
        this.reciprocalEndLandingDistanceAvailableLAHSO = reciprocalEndLandingDistanceAvailableLAHSO;
    }

    public String getReciprocalEndLandingDistanceAvailableLAHSOIntRwyID() {
        return reciprocalEndLandingDistanceAvailableLAHSOIntRwyID;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOIntRwyID(String reciprocalEndLandingDistanceAvailableLAHSOIntRwyID) {
        this.reciprocalEndLandingDistanceAvailableLAHSOIntRwyID = reciprocalEndLandingDistanceAvailableLAHSOIntRwyID;
    }

    public String getReciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc() {
        return reciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc(String reciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc) {
        this.reciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc = reciprocalEndLandingDistanceAvailableLAHSOIntEntityDesc;
    }

    public BigDecimal getReciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude() {
        return reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude(BigDecimal reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude) {
        this.reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude = reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitude;
    }

    public String getReciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS() {
        return reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS(String reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS) {
        this.reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS = reciprocalEndLandingDistanceAvailableLAHSOHldPtLatitudeS;
    }

    public BigDecimal getReciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude() {
        return reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude(BigDecimal reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude) {
        this.reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude = reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitude;
    }

    public String getReciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS() {
        return reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS(String reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS) {
        this.reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS = reciprocalEndLandingDistanceAvailableLAHSOHldPtLongitudeS;
    }

    public String getReciprocalEndLandingDistanceAvailableLAHSOCoordSrc() {
        return reciprocalEndLandingDistanceAvailableLAHSOCoordSrc;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOCoordSrc(String reciprocalEndLandingDistanceAvailableLAHSOCoordSrc) {
        this.reciprocalEndLandingDistanceAvailableLAHSOCoordSrc = reciprocalEndLandingDistanceAvailableLAHSOCoordSrc;
    }

    public String getReciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate() {
        return reciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate;
    }

    public void setReciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate(String reciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate) {
        this.reciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate = reciprocalEndLandingDistanceAvailableLAHSOCoordSrcDate;
    }

    public BigDecimal getReciprocalEndDisplacedElevation() {
        return reciprocalEndDisplacedElevation;
    }

    public void setReciprocalEndDisplacedElevation(BigDecimal reciprocalEndDisplacedElevation) {
        this.reciprocalEndDisplacedElevation = reciprocalEndDisplacedElevation;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
