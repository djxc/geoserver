package org.geoserver.djdemo.gp.request;

import org.locationtech.jts.geom.Geometry;

public class GPLengthRequest extends GPRequest {
    private Geometry[] geometries;

    public Geometry[] getGeometries() {
        return geometries;
    }

    public void setGeometries(Geometry[] geometries) {
        this.geometries = geometries;
    }
}
