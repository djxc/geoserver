/** */
package org.geoserver.djdemo.gp.request;

import java.util.ArrayList;
import java.util.List;
import org.geoserver.ows.KvpParser;
import org.locationtech.jts.geom.Geometry;

/** @author Administrator */
public class GeomsWKTKvpParser extends KvpParser {

    public GeomsWKTKvpParser() {
        super("geoms", Geometry[].class);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.geoserver.ows.KvpParser#parse(java.lang.String)
     */
    @Override
    public Geometry[] parse(String value) throws Exception {
        List geoms = getArgList(value);
        org.locationtech.jts.io.WKTReader reader = new org.locationtech.jts.io.WKTReader();
        Geometry[] ret = new Geometry[geoms.size()];
        for (int i = 0; i < geoms.size(); ++i) {
            ret[i] = reader.read(geoms.get(i).toString());
        }
        return ret;
    }

    private List getArgList(String str) {
        ArrayList ret = new ArrayList();
        for (String i : str.split("[|]")) {
            ret.add(i);
        }
        return ret;
    }
}
