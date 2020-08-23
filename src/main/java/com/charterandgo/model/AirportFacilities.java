package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class AirportFacilities {

    private String siteNumber;
    private String type;
    private String locationID;
    private Date effectiveDate;
    private String region;
    private String districtOffice;
    private String state;
    private String stateName;
    private String county;
    private String countyState;
    private String city;
    private String facilityName;
    private String ownership;
    private String use;
    private String owner;
    private String ownerAddress;
    private String ownerCSZ;
    private String ownerPhone;
    private String manager;
    private String managerAddress;
    private String managerCSZ;
    private String managerPhone;
    private BigDecimal ARPLatitude;
    private String ARPLatitudeS;
    private BigDecimal ARPLongitude;
    private String ARPLongitudeS;
    private String ARPMethod;
    private int ARPElevation;
    private String ARPElevationMethod;
    private String magneticVariation;
    private String magneticVariationYear;
    private String trafficPatternAltitude;
    private String chartName;
    private int distanceFromCBD;
    private String directionFromCBD;
    private int landAreaCoveredByAirport;
    private String boundaryARTCCID;
    private String boundaryARTCCComputerID;
    private String boundaryARTCCName;
    private String responsibleARTCCID;
    private String responsibleARTCCComputerID;
    private String responsibleARTCCName;
    private String tieInFSS;
    private String tieInFSSID;
    private String tieInFSSName;
    private String airportToFSSPhoneNumber;
    private String tieInFSSTollFreeNumber;
    private String alternateFSSID;
    private String alternateFSSName;
    private String alternateFSSTollFreeNumber;
    private String NOTAMFacilityID;
    private String NOTAMService;
    private Date activationDate;
    private String airportStatusCode;
    private String certificationTypeDate;
    private String federalAgreements;
    private String airspaceDetermination;
    private String customsAirportOfEntry;
    private String customsLandingRights;
    private String militaryJointUse;
    private String militaryLandingRights;
    private String inspectionMethod;
    private String inspectionGroup;
    private Date lastInspectionDate;
    private String lastOwnerInformationDate;
    private String fuelTypes;
    private String airframeRepair;
    private String powerPlantRepair;
    private String bottledOxygenType;
    private String bulkOxygenType;
    private String lightingSchedule;
    private String beaconSchedule;
    private boolean ATCT;
    private String UNICOMFrequencies;
    private String CTAFFrequency;
    private String segmentedCircle;
    private String beaconColor;
    private String nonCommercialLandingFee;
    private String medicalUse;
    private int singleEngineGA;
    private int multiEngineGA;
    private int jetEngineGA;
    private int helicoptersGA;
    private int glidersOperational;
    private int militaryOperational;
    private int ultralights;
    private int operationsCommercial;
    private int operationsCommuter;
    private int operationsAirTaxi;
    private int operationsGALocal;
    private int operationsGAItin;
    private int operationsMilitary;
    private Date operationsDate;
    private String airportPositionSource;
    private Date airportPositionSourceDate;
    private String airportElevationSource;
    private Date airportElevationSourceDate;
    private String contractFuelAvailable;
    private String transientStorage;
    private String otherServices;
    private String windIndicator;
    private String icaoIdentifier;
    private boolean minimumOperationalNetwork;
    private Date lastUpdated;

    public AirportFacilities() {

    }

    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrictOffice() {
        return districtOffice;
    }

    public void setDistrictOffice(String districtOffice) {
        this.districtOffice = districtOffice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountyState() {
        return countyState;
    }

    public void setCountyState(String countyState) {
        this.countyState = countyState;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerCSZ() {
        return ownerCSZ;
    }

    public void setOwnerCSZ(String ownerCSZ) {
        this.ownerCSZ = ownerCSZ;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManagerAddress() {
        return managerAddress;
    }

    public void setManagerAddress(String managerAddress) {
        this.managerAddress = managerAddress;
    }

    public String getManagerCSZ() {
        return managerCSZ;
    }

    public void setManagerCSZ(String managerCSZ) {
        this.managerCSZ = managerCSZ;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public BigDecimal getARPLatitude() {
        return ARPLatitude;
    }

    public void setARPLatitude(BigDecimal ARPLatitude) {
        this.ARPLatitude = ARPLatitude;
    }

    public String getARPLatitudeS() {
        return ARPLatitudeS;
    }

    public void setARPLatitudeS(String ARPLatitudeS) {
        this.ARPLatitudeS = ARPLatitudeS;
    }

    public BigDecimal getARPLongitude() {
        return ARPLongitude;
    }

    public void setARPLongitude(BigDecimal ARPLongitude) {
        this.ARPLongitude = ARPLongitude;
    }

    public String getARPLongitudeS() {
        return ARPLongitudeS;
    }

    public void setARPLongitudeS(String ARPLongitudeS) {
        this.ARPLongitudeS = ARPLongitudeS;
    }

    public String getARPMethod() {
        return ARPMethod;
    }

    public void setARPMethod(String ARPMethod) {
        this.ARPMethod = ARPMethod;
    }

    public int getARPElevation() {
        return ARPElevation;
    }

    public void setARPElevation(int ARPElevation) {
        this.ARPElevation = ARPElevation;
    }

    public String getARPElevationMethod() {
        return ARPElevationMethod;
    }

    public void setARPElevationMethod(String ARPElevationMethod) {
        this.ARPElevationMethod = ARPElevationMethod;
    }

    public String getMagneticVariation() {
        return magneticVariation;
    }

    public void setMagneticVariation(String magneticVariation) {
        this.magneticVariation = magneticVariation;
    }

    public String getMagneticVariationYear() {
        return magneticVariationYear;
    }

    public void setMagneticVariationYear(String magneticVariationYear) {
        this.magneticVariationYear = magneticVariationYear;
    }

    public String getTrafficPatternAltitude() {
        return trafficPatternAltitude;
    }

    public void setTrafficPatternAltitude(String trafficPatternAltitude) {
        this.trafficPatternAltitude = trafficPatternAltitude;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public int getDistanceFromCBD() {
        return distanceFromCBD;
    }

    public void setDistanceFromCBD(int distanceFromCBD) {
        this.distanceFromCBD = distanceFromCBD;
    }

    public String getDirectionFromCBD() {
        return directionFromCBD;
    }

    public void setDirectionFromCBD(String directionFromCBD) {
        this.directionFromCBD = directionFromCBD;
    }

    public int getLandAreaCoveredByAirport() {
        return landAreaCoveredByAirport;
    }

    public void setLandAreaCoveredByAirport(int landAreaCoveredByAirport) {
        this.landAreaCoveredByAirport = landAreaCoveredByAirport;
    }

    public String getBoundaryARTCCID() {
        return boundaryARTCCID;
    }

    public void setBoundaryARTCCID(String boundaryARTCCID) {
        this.boundaryARTCCID = boundaryARTCCID;
    }

    public String getBoundaryARTCCComputerID() {
        return boundaryARTCCComputerID;
    }

    public void setBoundaryARTCCComputerID(String boundaryARTCCComputerID) {
        this.boundaryARTCCComputerID = boundaryARTCCComputerID;
    }

    public String getBoundaryARTCCName() {
        return boundaryARTCCName;
    }

    public void setBoundaryARTCCName(String boundaryARTCCName) {
        this.boundaryARTCCName = boundaryARTCCName;
    }

    public String getResponsibleARTCCID() {
        return responsibleARTCCID;
    }

    public void setResponsibleARTCCID(String responsibleARTCCID) {
        this.responsibleARTCCID = responsibleARTCCID;
    }

    public String getResponsibleARTCCComputerID() {
        return responsibleARTCCComputerID;
    }

    public void setResponsibleARTCCComputerID(String responsibleARTCCComputerID) {
        this.responsibleARTCCComputerID = responsibleARTCCComputerID;
    }

    public String getResponsibleARTCCName() {
        return responsibleARTCCName;
    }

    public void setResponsibleARTCCName(String responsibleARTCCName) {
        this.responsibleARTCCName = responsibleARTCCName;
    }

    public String getTieInFSS() {
        return tieInFSS;
    }

    public void setTieInFSS(String tieInFSS) {
        this.tieInFSS = tieInFSS;
    }

    public String getTieInFSSID() {
        return tieInFSSID;
    }

    public void setTieInFSSID(String tieInFSSID) {
        this.tieInFSSID = tieInFSSID;
    }

    public String getTieInFSSName() {
        return tieInFSSName;
    }

    public void setTieInFSSName(String tieInFSSName) {
        this.tieInFSSName = tieInFSSName;
    }

    public String getAirportToFSSPhoneNumber() {
        return airportToFSSPhoneNumber;
    }

    public void setAirportToFSSPhoneNumber(String airportToFSSPhoneNumber) {
        this.airportToFSSPhoneNumber = airportToFSSPhoneNumber;
    }

    public String getTieInFSSTollFreeNumber() {
        return tieInFSSTollFreeNumber;
    }

    public void setTieInFSSTollFreeNumber(String tieInFSSTollFreeNumber) {
        this.tieInFSSTollFreeNumber = tieInFSSTollFreeNumber;
    }

    public String getAlternateFSSID() {
        return alternateFSSID;
    }

    public void setAlternateFSSID(String alternateFSSID) {
        this.alternateFSSID = alternateFSSID;
    }

    public String getAlternateFSSName() {
        return alternateFSSName;
    }

    public void setAlternateFSSName(String alternateFSSName) {
        this.alternateFSSName = alternateFSSName;
    }

    public String getAlternateFSSTollFreeNumber() {
        return alternateFSSTollFreeNumber;
    }

    public void setAlternateFSSTollFreeNumber(String alternateFSSTollFreeNumber) {
        this.alternateFSSTollFreeNumber = alternateFSSTollFreeNumber;
    }

    public String getNOTAMFacilityID() {
        return NOTAMFacilityID;
    }

    public void setNOTAMFacilityID(String NOTAMFacilityID) {
        this.NOTAMFacilityID = NOTAMFacilityID;
    }

    public String getNOTAMService() {
        return NOTAMService;
    }

    public void setNOTAMService(String NOTAMService) {
        this.NOTAMService = NOTAMService;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public String getAirportStatusCode() {
        return airportStatusCode;
    }

    public void setAirportStatusCode(String airportStatusCode) {
        this.airportStatusCode = airportStatusCode;
    }

    public String getCertificationTypeDate() {
        return certificationTypeDate;
    }

    public void setCertificationTypeDate(String certificationTypeDate) {
        this.certificationTypeDate = certificationTypeDate;
    }

    public String getFederalAgreements() {
        return federalAgreements;
    }

    public void setFederalAgreements(String federalAgreements) {
        this.federalAgreements = federalAgreements;
    }

    public String getAirspaceDetermination() {
        return airspaceDetermination;
    }

    public void setAirspaceDetermination(String airspaceDetermination) {
        this.airspaceDetermination = airspaceDetermination;
    }

    public String getCustomsAirportOfEntry() {
        return customsAirportOfEntry;
    }

    public void setCustomsAirportOfEntry(String customsAirportOfEntry) {
        this.customsAirportOfEntry = customsAirportOfEntry;
    }

    public String getCustomsLandingRights() {
        return customsLandingRights;
    }

    public void setCustomsLandingRights(String customsLandingRights) {
        this.customsLandingRights = customsLandingRights;
    }

    public String getMilitaryJointUse() {
        return militaryJointUse;
    }

    public void setMilitaryJointUse(String militaryJointUse) {
        this.militaryJointUse = militaryJointUse;
    }

    public String getMilitaryLandingRights() {
        return militaryLandingRights;
    }

    public void setMilitaryLandingRights(String militaryLandingRights) {
        this.militaryLandingRights = militaryLandingRights;
    }

    public String getInspectionMethod() {
        return inspectionMethod;
    }

    public void setInspectionMethod(String inspectionMethod) {
        this.inspectionMethod = inspectionMethod;
    }

    public String getInspectionGroup() {
        return inspectionGroup;
    }

    public void setInspectionGroup(String inspectionGroup) {
        this.inspectionGroup = inspectionGroup;
    }

    public Date getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(Date lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
    }

    public String getLastOwnerInformationDate() {
        return lastOwnerInformationDate;
    }

    public void setLastOwnerInformationDate(String lastOwnerInformationDate) {
        this.lastOwnerInformationDate = lastOwnerInformationDate;
    }

    public String getFuelTypes() {
        return fuelTypes;
    }

    public void setFuelTypes(String fuelTypes) {
        this.fuelTypes = fuelTypes;
    }

    public String getAirframeRepair() {
        return airframeRepair;
    }

    public void setAirframeRepair(String airframeRepair) {
        this.airframeRepair = airframeRepair;
    }

    public String getPowerPlantRepair() {
        return powerPlantRepair;
    }

    public void setPowerPlantRepair(String powerPlantRepair) {
        this.powerPlantRepair = powerPlantRepair;
    }

    public String getBottledOxygenType() {
        return bottledOxygenType;
    }

    public void setBottledOxygenType(String bottledOxygenType) {
        this.bottledOxygenType = bottledOxygenType;
    }

    public String getBulkOxygenType() {
        return bulkOxygenType;
    }

    public void setBulkOxygenType(String bulkOxygenType) {
        this.bulkOxygenType = bulkOxygenType;
    }

    public String getLightingSchedule() {
        return lightingSchedule;
    }

    public void setLightingSchedule(String lightingSchedule) {
        this.lightingSchedule = lightingSchedule;
    }

    public String getBeaconSchedule() {
        return beaconSchedule;
    }

    public void setBeaconSchedule(String beaconSchedule) {
        this.beaconSchedule = beaconSchedule;
    }

    public boolean isATCT() {
        return ATCT;
    }

    public void setATCT(boolean ATCT) {
        this.ATCT = ATCT;
    }

    public String getUNICOMFrequencies() {
        return UNICOMFrequencies;
    }

    public void setUNICOMFrequencies(String UNICOMFrequencies) {
        this.UNICOMFrequencies = UNICOMFrequencies;
    }

    public String getCTAFFrequency() {
        return CTAFFrequency;
    }

    public void setCTAFFrequency(String CTAFFrequency) {
        this.CTAFFrequency = CTAFFrequency;
    }

    public String getSegmentedCircle() {
        return segmentedCircle;
    }

    public void setSegmentedCircle(String segmentedCircle) {
        this.segmentedCircle = segmentedCircle;
    }

    public String getBeaconColor() {
        return beaconColor;
    }

    public void setBeaconColor(String beaconColor) {
        this.beaconColor = beaconColor;
    }

    public String getNonCommercialLandingFee() {
        return nonCommercialLandingFee;
    }

    public void setNonCommercialLandingFee(String nonCommercialLandingFee) {
        this.nonCommercialLandingFee = nonCommercialLandingFee;
    }

    public String getMedicalUse() {
        return medicalUse;
    }

    public void setMedicalUse(String medicalUse) {
        this.medicalUse = medicalUse;
    }

    public int getSingleEngineGA() {
        return singleEngineGA;
    }

    public void setSingleEngineGA(int singleEngineGA) {
        this.singleEngineGA = singleEngineGA;
    }

    public int getMultiEngineGA() {
        return multiEngineGA;
    }

    public void setMultiEngineGA(int multiEngineGA) {
        this.multiEngineGA = multiEngineGA;
    }

    public int getJetEngineGA() {
        return jetEngineGA;
    }

    public void setJetEngineGA(int jetEngineGA) {
        this.jetEngineGA = jetEngineGA;
    }

    public int getHelicoptersGA() {
        return helicoptersGA;
    }

    public void setHelicoptersGA(int helicoptersGA) {
        this.helicoptersGA = helicoptersGA;
    }

    public int getGlidersOperational() {
        return glidersOperational;
    }

    public void setGlidersOperational(int glidersOperational) {
        this.glidersOperational = glidersOperational;
    }

    public int getMilitaryOperational() {
        return militaryOperational;
    }

    public void setMilitaryOperational(int militaryOperational) {
        this.militaryOperational = militaryOperational;
    }

    public int getUltralights() {
        return ultralights;
    }

    public void setUltralights(int ultralights) {
        this.ultralights = ultralights;
    }

    public int getOperationsCommercial() {
        return operationsCommercial;
    }

    public void setOperationsCommercial(int operationsCommercial) {
        this.operationsCommercial = operationsCommercial;
    }

    public int getOperationsCommuter() {
        return operationsCommuter;
    }

    public void setOperationsCommuter(int operationsCommuter) {
        this.operationsCommuter = operationsCommuter;
    }

    public int getOperationsAirTaxi() {
        return operationsAirTaxi;
    }

    public void setOperationsAirTaxi(int operationsAirTaxi) {
        this.operationsAirTaxi = operationsAirTaxi;
    }

    public int getOperationsGALocal() {
        return operationsGALocal;
    }

    public void setOperationsGALocal(int operationsGALocal) {
        this.operationsGALocal = operationsGALocal;
    }

    public int getOperationsGAItin() {
        return operationsGAItin;
    }

    public void setOperationsGAItin(int operationsGAItin) {
        this.operationsGAItin = operationsGAItin;
    }

    public int getOperationsMilitary() {
        return operationsMilitary;
    }

    public void setOperationsMilitary(int operationsMilitary) {
        this.operationsMilitary = operationsMilitary;
    }

    public Date getOperationsDate() {
        return operationsDate;
    }

    public void setOperationsDate(Date operationsDate) {
        this.operationsDate = operationsDate;
    }

    public String getAirportPositionSource() {
        return airportPositionSource;
    }

    public void setAirportPositionSource(String airportPositionSource) {
        this.airportPositionSource = airportPositionSource;
    }

    public Date getAirportPositionSourceDate() {
        return airportPositionSourceDate;
    }

    public void setAirportPositionSourceDate(Date airportPositionSourceDate) {
        this.airportPositionSourceDate = airportPositionSourceDate;
    }

    public String getAirportElevationSource() {
        return airportElevationSource;
    }

    public void setAirportElevationSource(String airportElevationSource) {
        this.airportElevationSource = airportElevationSource;
    }

    public Date getAirportElevationSourceDate() {
        return airportElevationSourceDate;
    }

    public void setAirportElevationSourceDate(Date airportElevationSourceDate) {
        this.airportElevationSourceDate = airportElevationSourceDate;
    }

    public String getContractFuelAvailable() {
        return contractFuelAvailable;
    }

    public void setContractFuelAvailable(String contractFuelAvailable) {
        this.contractFuelAvailable = contractFuelAvailable;
    }

    public String getTransientStorage() {
        return transientStorage;
    }

    public void setTransientStorage(String transientStorage) {
        this.transientStorage = transientStorage;
    }

    public String getOtherServices() {
        return otherServices;
    }

    public void setOtherServices(String otherServices) {
        this.otherServices = otherServices;
    }

    public String getWindIndicator() {
        return windIndicator;
    }

    public void setWindIndicator(String windIndicator) {
        this.windIndicator = windIndicator;
    }

    public String getIcaoIdentifier() {
        return icaoIdentifier;
    }

    public void setIcaoIdentifier(String icaoIdentifier) {
        this.icaoIdentifier = icaoIdentifier;
    }

    public boolean isMinimumOperationalNetwork() {
        return minimumOperationalNetwork;
    }

    public void setMinimumOperationalNetwork(boolean minimumOperationalNetwork) {
        this.minimumOperationalNetwork = minimumOperationalNetwork;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
