package org.geoserver.djdemo.gp.request;

import org.locationtech.jts.geom.Geometry;

public class GPBufferRequest extends GPRequest {
    private Geometry[] geometries;
    private double distance;

    public Geometry[] getGeometries() {
        return geometries;
    }

    public void setGeometries(Geometry[] geometries) {
        this.geometries = geometries;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
