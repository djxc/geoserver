扩展geoserver功能

- 1 http://localhost:8080/geoserver/ows?request=getlengths&service=gp&version=1.0.0&geoms=LINESTRING%20(%201%205,%205%205,%205%201,%203%203,%201%201%20)|LINESTRING%20(%201%205,%205%205,%205%201,%203%203,%201%201%20)
- 2 http://localhost:8080/geoserver/ows?request=getbuffers&service=gp&version=1.0.0&distance=10&geoms=LINESTRING%20(%201%205,%205%205,%205%201,%203%203,%201%201%20)|LINESTRING%20(%201%205,%205%205,%205%201,%203%203,%201%201%20)
- 3 http://localhost:8080/geoserver/web/?wicket:bookmarkablePage=:wj.demos.web.GPDemoPage