interface RouteStrategy {
    void buildRoute(String start ,String end);
}
class CarRoute implements RouteStrategy{
    @Override
    public void buildRoute(String start ,String end){
        System.out.println("route for car "+start+" to "+end);
    }
}
class WalkingRoute implements RouteStrategy{
    @Override
    public void buildRoute(String start ,String end){
        System.out.println("route for Waling "+start+" to "+end);
    }
}
class TransportRoute implements RouteStrategy{
    @Override
    public void buildRoute(String start ,String end){
        System.out.println("route for transport "+start+" to "+end);
    }
}
class BicRoute implements RouteStrategy{
    @Override
    public void buildRoute(String start ,String end){
        System.out.println("route for bicycle "+start+" to "+end);
    }
}
class Navigation {
    private RouteStrategy routeStrategy;
    public void CalculateRouttime(RouteStrategy routeStrategy){
        this.routeStrategy=routeStrategy;
    } 

    public void setRouteStrategy(RouteStrategy routeStrategy){
        this.routeStrategy=routeStrategy;
    }
    public void buildRoute(String start ,String end){
        if (routeStrategy==null){
            System.out.println("Error");
        }else {
            routeStrategy.buildRoute(start,end);
        }
    }

}













 public class Main{
    public static void main(String[] args){
      Navigation app = new Navigation(new CarRoute());
      app.buildRoute("Home","Work");
      app.CalculateRouttime();


    //   app.setRouteStrategy(new CarRoute());
    //   app.buildRoute("","");


    //   app.setRouteStrategy(new TransportRoute());
    //   app.buildRoute("","");


    //   app.setRouteStrategy(new BicRoute());
    //   app.buildRoute("","");

    }
 }