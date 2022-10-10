package org.geoserver.djdemo.gp.request;

import java.util.Map;
import org.geoserver.ows.KvpRequestReader;
import org.locationtech.jts.geom.Geometry;

public class GPLengthKVPReader extends KvpRequestReader {
    /**
     * Creats the new kvp request reader.
     *
     * @param requestBean The type of the request read, not <code>null</code>
     */
    public GPLengthKVPReader(Class<?> requestBean) {
        super(GPLengthRequest.class);
    }

    public GPLengthRequest read(Object req, Map kvp, Map rawKvp) throws Exception {
        GPLengthRequest request = (GPLengthRequest) super.read(req, kvp, rawKvp);
        request.setRawKvp(rawKvp);
        request.setGeometries((Geometry[]) kvp.get("GEOMS"));
        return request;
    }
}
