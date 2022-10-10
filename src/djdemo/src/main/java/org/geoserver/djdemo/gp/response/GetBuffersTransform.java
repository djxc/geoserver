/** */
package org.geoserver.djdemo.gp.response;

import java.util.List;
import org.locationtech.jts.geom.Geometry;

/** encode缓冲区测量结果 */
public class GetBuffersTransform {

    private List<Geometry> geometries;

    public GetBuffersTransform(List<Geometry> geometries) {
        this.geometries = geometries;
    }

    @Override
    public String toString() {
        org.locationtech.jts.io.WKTWriter writer = new org.locationtech.jts.io.WKTWriter();
        StringBuilder sb = new StringBuilder();
        for (Geometry i : geometries) {
            if (sb.length() > 1) sb.append("|");
            sb.append(writer.write(i));
        }
        return sb.toString();
    }
}
