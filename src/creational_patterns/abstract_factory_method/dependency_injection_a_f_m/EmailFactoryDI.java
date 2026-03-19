package creational_patterns.abstract_factory_method.dependency_injection_a_f_m;

import creational_patterns.abstract_factory_method.NotificationAbstractFactory;

/*
USAGE:::::::::::::::::::::::::::
        ----------------------------------------------------
        @Service
        public class NotificationService {

            private final NotificationAbstractFactory factory;

            public NotificationService(NotificationAbstractFactory factory) {
                this.factory = factory;
            }
        }
        -------------------------------------------------------

4️⃣ Dependency Injection Based Abstract Factory

Modern frameworks like Spring Framework use DI for this.
 */

@Component
public class EmailFactoryDI implements NotificationAbstractFactory {
}
