/** */
package org.geoserver.djdemo.gp.request;

import java.util.Map;
import org.geoserver.ows.KvpRequestReader;

/** @author Wang Jiang */
public class GPKVPReader extends KvpRequestReader {

    /** @param requestBean */
    public GPKVPReader(Class requestBean) {
        super(requestBean);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object read(Object request, Map kvp, Map rawKvp) throws Exception {
        GPRequest glr = (GPRequest) request;
        glr.setRawKvp(kvp);
        // TODO Auto-generated method stub
        return super.read(request, kvp, rawKvp);
    }
}
