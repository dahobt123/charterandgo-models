package com.charterandgo.model;

import java.util.ArrayList;
import java.util.List;

public class Itinerary {

    private List<Segment> segments = new ArrayList<>();

    /* Segments look like this:
    private int id;
    private String tailNumber;
    private String origin;
    private String destination;
    private Date departure;
    private Date arrival;
    private String actionCode;
    private String oldActionCode;
    private String owner;
    private int seatsSold;
    private int cargoSold;

     */

    //  So - the field actionCode in the segment tells what it is - for instance,
    //  a request for a reposition would have an action code of AR
    //  pax segments would have an action code of A
    //  empty leg segments would have an action code of AE

    /* So the schedule service would receive this list of segments...no need to have empty fields if something is
    not needed...the service would examine segment by segment, examining the action code do determine the
    correct
     */
}
