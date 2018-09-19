class complejo {
    private double real;
    private double img;
  
    public complejo() {
   
    }
    
    public complejo(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getImagine() {
        return img;
    }

    public void setImagine(double imagine) {
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
   
    public complejo sumar(complejo c){
        complejo aux = new complejo();
        aux.real = real + c.real;
        aux.img = img + c.img;
        return aux;
    }
   
    public complejo restar(complejo c){
        complejo aux = new complejo();
        aux.real = real - c.real;
        aux.img = img - c.img;
        return aux;
    }
   
    public complejo multiplicar(complejo c){
        complejo aux = new complejo();
        aux.real = real * c.real - img * c.img;
        aux.img = real * c.img + img * c.real;
        return aux;
    }
   
    public complejo multiplicar(double n){
        complejo aux = new complejo();
        aux.real = real * n;
        aux.img = img * n;
        return aux;
    }
   
    public complejo dividir(complejo c){
        complejo aux = new complejo();
        aux.real = (real * c.real + img * c.img)/(c.real * c.real + c.img * c.img);
        aux.img = (img * c.real - real * c.img)/(c.real * c.real + c.img * c.img);
        return aux;
    }

    //método toString para sobreescribir
    @Override
    public String toString() {
        return "(" + real + ", " + img + ")";
    }

    //método equals para comparar objetos
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final complejo other = (complejo) obj;
        if (this.real != other.real) {
            return false;
        }
        if (this.img != other.img) {
            return false;
        }
        return true;
    } 
} 
