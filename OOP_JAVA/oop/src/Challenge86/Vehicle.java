/*define a base class Vehicle with the method service and a subclass Car that overrides service
. In Car's service(), provides a specific implementation that calls super.service() as well, to show how overriding works.
*/

package Challenge86;

public class Vehicle {
    public void service(){
        System.out.println("The Vehicle has started");
    }
}
