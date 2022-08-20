package Taller;

import java.util.Scanner;

class main {

    /**
     * Metodos estaticos que sieven para crear listas de objetos
     */
    final static int num = 100;
    static Scanner entrada = new Scanner(System.in);
    static Order orders[] = new Order[num];
    static Invoice invoices[] = new Invoice[num];
    static Location locations[] = new Location[num];

    public static void main(String[] args) {
        /**
         * LLamado a metodo meñu
         */
        menu();
    }

    /**
     * Metodo estatico que muestra el menu para enviar un paquete
     */
    public static void menu() {
        int opcion = 0;

        do {
            System.out.println("\n\t.:MEÑU:.");
            System.out.println("1. Enviar un paquete");
            System.out.println("2. Salir");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    sendPackage();
                    break;
                case 2:
                    System.out.println("Haz salido del meñu\n");
                default:
                    System.out.println("Opcion incorrecta\n");
            }

        } while (opcion != 2);
    }

    /**
     * Metodo que sirve para enviar un paquete
     */
    public static void sendPackage() {
        StandardPackage pack = null;
        Location dir_a, dir_b;
        Customer user_a, user_b;
        Delivery user_c;
        String a, b, c, d, e, f, g, h, i, j;
        int k;
        float TotalPagar;

        /**
         * Aqui nosotros ingresamos los datos de la persona que va a emviar y de
         * la persona que lo va a recibir por consola
         */
        System.out.println("Ingresar los datos del remitente: ");
        entrada.nextLine();
        System.out.println("Identificacion: ");
        a = entrada.nextLine();
        System.out.println("Nacionalidad: ");
        b = entrada.nextLine();
        System.out.println("Nombre: ");
        c = entrada.nextLine();
        System.out.println("Apellido: ");
        d = entrada.nextLine();
        System.out.println("Email: ");
        e = entrada.nextLine();

        System.out.println("Ingresar la direccion del remitente: ");
        System.out.println("Pais: ");
        f = entrada.nextLine();
        System.out.println("Departamento: ");
        g = entrada.nextLine();
        System.out.println("Ciudad: ");
        h = entrada.nextLine();
        System.out.println("Calle: ");
        i = entrada.nextLine();
        System.out.println("Carrera: ");
        j = entrada.nextLine();
        System.out.println("Codigo postal: ");
        k = entrada.nextInt();

        dir_a = new Location(f, g, h, i, j, k);
        locations[0] = dir_a;
        user_a = new Customer(null, locations[0], null, a, b, "CC", c, e, d, dir_a, PersonType.LEGAL);

        System.out.println("Ingresar los datos del Destinatario: ");
        entrada.nextLine();
        System.out.println("Identificacion: ");
        a = entrada.nextLine();
        System.out.println("Nacionalidad: ");
        b = entrada.nextLine();
        System.out.println("Nombre: ");
        c = entrada.nextLine();
        System.out.println("Apellido: ");
        d = entrada.nextLine();
        System.out.println("Email: ");
        e = entrada.nextLine();

        System.out.println("Ingresar la direccion del Destinatario: ");
        System.out.println("Pais: ");
        f = entrada.nextLine();
        System.out.println("Departamento: ");
        g = entrada.nextLine();
        System.out.println("Ciudad: ");
        h = entrada.nextLine();
        System.out.println("Calle: ");
        i = entrada.nextLine();
        System.out.println("Carrera: ");
        j = entrada.nextLine();
        System.out.println("Codigo postal: ");
        k = entrada.nextInt();

        dir_b = new Location(f, g, h, i, j, k);
        locations[1] = dir_b;
        user_b = new Customer(null, locations[1], null, a, b, "CC", c, e, d, dir_b, PersonType.LEGAL);

        /**
         * Una vez ingresado los datos por consola se le agregar por medio del
         * constructor de customer los datos
         *
         * Se crea el paquete con unos datos ingresados de una vez en el
         * constructor
         */
        pack = new StandardPackage(5500, "E0001", "Chancletas", 003145, (float) 7.5, 10000, (float) 2.5, user_a);
        TotalPagar = pack.calculate(pack.getGramsPrice(), pack.getWeight(), pack.getQuota());

        /**
         * Una vez creado el paquete se crea una orden con los datos de las
         * personas, direcciones y paquetes involucrados
         */
        Package OPack = (Package) pack;
        orders[0] = new Order("Or0001", OPack, true, TotalPagar, user_b, user_a, OrderStatus.PENDING, locations[0]);

        user_c = new Delivery(orders[0], DeliveryStatus.DRAFTED, null, null, null);

        /**
         * Y cuando se crea la orden se crea la factura que relacionan todas las
         * clases mencionadas anteriormente
         */
        invoices[0] = new Invoice("Inv0001", 0, TotalPagar, 0, orders[0], InvoiceStatus.SENT, user_a, PaymentMethodsTypes.CASH);

        /**
         * Se agregan las facturas a las personas y se muestra por consola un
         * resumen de las operacions que se hicieron
         */
        user_a.setInvoices(invoices[0]);
        user_b.setInvoices(invoices[0]);

        System.out.println("\n\tDATOS DEL REMITENTE"
                + "\nIdentidad: " + user_a.getId()
                + "\nNombre: " + user_a.getName()
                + "\nDireccion de origen: " + locations[0]
                + "\nDireccion de envio: " + locations[1]
                + "\nId Factura: " + user_a.getInvoices().getId());

        System.out.println("\n\tDATOS DEL DESTINATARIO"
                + "\nIdentidad: " + user_b.getId()
                + "\nNombre: " + user_b.getName()
                + "\nId Factura: " + user_b.getInvoices().getId());

        System.out.println("\n\tDATOS DEL PAQUETE"
                + "\nId del paquete: " + pack.getId()
                + "\nDescripcion: " + pack.getDescription()
                + "\nPeso: " + pack.getWeight()
                + "\nPrecio de gramo:" + pack.getGramsPrice()
                + "\nCuota fija: " + pack.getQuota());

        System.out.println("\n\tDATOS DE LA ORDEN"
                + "\nId de la orden: " + orders[0].getId()
                + "\nId Paquete: " + orders[0].getPackages().getId()
                + "\nPago valido: " + orders[0].isPaid()
                + "\nId Remitente: " + orders[0].getSender().getId()
                + "\nId Destinatario: " + orders[0].getReceiver().getId());

        System.out.println("\n\tDATOS DE LA FACTURA"
                + "\nId de la factura: " + invoices[0].getId()
                + "\nId de la orden: " + invoices[0].getOrders().getId()
                + "\nEstado: " + invoices[0].getStatus()
                + "\nTotal a pagar: " + invoices[0].getPrice()
                + "\nMetodo de pago: " + invoices[0].getPaymentMethod());
    }
}
