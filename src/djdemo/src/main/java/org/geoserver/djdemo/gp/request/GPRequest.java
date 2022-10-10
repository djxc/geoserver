/** */
package org.geoserver.djdemo.gp.request;

import java.util.Map;

/** @author Wang Jiang */
public class GPRequest {
    private Map rawKvp;

    public void setRawKvp(Map rawKvp) {
        this.rawKvp = rawKvp;
    }

    public Map getRawKvp() {
        return rawKvp;
    }
}
