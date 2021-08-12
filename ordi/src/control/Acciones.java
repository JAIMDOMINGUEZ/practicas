public class Acciones {

    private Ventana v;
    //(1)Atributo privado de tipo TreeSet (lista) que almacena objetos de tipo Figura
    //(2)Atributo privado y entero (lados)

    public Acciones(Ventana v) {
        this.v = v; 
    }

    private boolean validar(String dato, int min, int max) {
        //(3) Convertir (dato) a entero (valor)
        //(4) Si es posible hacerlo, regresar:
            //verdadero si (valor >= min y valor <= max)
            //caso contrario, false
            //
        //No es posible convertir a entero, regresar falso
    }

    public void chkLados() {
        //deshabilitar el botón btnAdd 
        //Si el contenido de txtLados (texto) es una cadena vacia ("")
        //terminar el método con la palabre return;

        //Usar el método validad con el contenido de txtLados
        // y los valores min = 3 max = 4
        //Si regresa verdadero
            //Atributo lados = Entero(txtLados.getText())
            //Habilitar el botón btnAdd
        //No regresa verdadero showMessageDialog(v, "Valores incorrectos")
    }

    public void addFigura() {
        //validar los lados 1 - 100
        boolean l1 = validar(/* texto de txtLad1 */, 1, 100);
        boolean l2 = validar(/* texto de txtLad2 */, 1, 100);
        boolean l3 = validar(/* texto de txtLad3 */, 1, 100);
        boolean l4 = validar(/* texto de txtLad4 */, 1, 100);
        //crear la figura
        Figura f = null;
        if (lados == 3 && l1 && l2 && l3 && l4) {
            int a1 = Integer.parseInt(/* texto de txtLad1 */);
            int a2 = Integer.parseInt(/* texto de txtLad2 */);
            int a3 = Integer.parseInt(/* texto de txtLad3 */);
            int a4 = Integer.parseInt(/* texto de txtLad4 */);
            f = new Triangulo(a1, a2, a3, a4);
        }
        if (lados == 4 && l1 && l2) {
            int a1 = Integer.parseInt(/* texto de txtLad1 */);
            int a2 = Integer.parseInt(/* texto de txtLad2 */);
            f = new Rectangulo(a1, a2);
        }
        if (f != null) {
            System.out.println(f);
            lista.add(f);
        }
        showLista();
    }

    private void showLista() {
        //Limpiar el contenido de txtFiguras
        if (lista.size() > 0) {
            for (Figura figura : lista) {
                //agregar el toString de figura a txtFiguras
                //agregar un salto de linea a txtFiguras
            }
        }
    }

    public void saveFile() {

        String path = System.getProperty("user.home")+System.getProperty("file.separator")+"/documents";
        String pathh = System.getProperty("user.home")+System.getProperty("file.separator")+"/documentos";

        String path = System.getProperty("user.home")+System.getProperty("file.separator")+"\\Documents";
        //Verificar si el directorio de los documentos en HOME es
        //Documents o Documentos
        //Crear dentro de dicho directorio el archivo ordinario.out
        File archivo = new File(path);
        //Imprimir la ruta del archivo para verificar
        System.out.println(path);
        //Ejemplo System.out.println(file) <- ruta del archivo
        // NO MODIFICAR EL SIGIENTE CÓDIGO
        //Solo podrá cambiar la variable (file) <- ruta del archivo
        try{
            FileWriter fr = new FileWriter(file); //<- (file) ruta del archivo 
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write(/*texto de txtFiguras */);
            bw.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
