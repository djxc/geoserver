/** */
package org.geoserver.djdemo.gp;

import java.util.ArrayList;
import org.geoserver.djdemo.gp.request.GPBufferRequest;
import org.geoserver.djdemo.gp.request.GPLengthRequest;
import org.geoserver.djdemo.gp.response.GetBuffersTransform;
import org.geoserver.djdemo.gp.response.GetLengthsTransform;
import org.locationtech.jts.geom.Geometry;

/** 自定义的GP服务 */
public class GPService {

    public GetLengthsTransform getLengths(GPLengthRequest request) {
        ArrayList<Double> lengths = new ArrayList<Double>();
        for (Geometry geo : request.getGeometries()) {
            lengths.add(geo.getLength());
        }
        return new GetLengthsTransform(lengths);
    }

    public GetBuffersTransform getBuffers(GPBufferRequest request) {
        ArrayList<Geometry> out = new ArrayList<Geometry>();
        for (Geometry geo : request.getGeometries()) {
            out.add(geo.buffer(request.getDistance()));
        }
        return new GetBuffersTransform(out);
    }
}
