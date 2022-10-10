/** */
package org.geoserver.djdemo.gp.response;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.geoserver.ows.Response;
import org.geoserver.platform.Operation;
import org.geoserver.platform.ServiceException;

/** 响应 */
public class GPResponse extends Response {

    public GPResponse(Class binding) {
        super(binding);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.geoserver.ows.Response#getMimeType(java.lang.Object, org.geoserver.platform.Operation)
     */
    @Override
    public String getMimeType(Object value, Operation operation) throws ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.geoserver.ows.Response#write(java.lang.Object, java.io.OutputStream, org.geoserver.platform.Operation)
     */
    @Override
    public void write(Object value, OutputStream output, Operation operation)
            throws IOException, ServiceException {
        PrintStream print = new PrintStream(output);
        print.print(value.toString());
    }
}
