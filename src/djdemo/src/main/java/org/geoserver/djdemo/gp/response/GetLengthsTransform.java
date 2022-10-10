/** */
package org.geoserver.djdemo.gp.response;

import java.util.List;

/** encode长度测量结果 */
public class GetLengthsTransform {

    private List<Double> lengths;

    public GetLengthsTransform(List<Double> lengths) {
        this.lengths = lengths;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Double length : lengths) {
            stringBuilder.append(length + ", ");
        }
        String result = stringBuilder.substring(0, stringBuilder.length() - 3);
        result = result + "]";
        return result;
    }
}
