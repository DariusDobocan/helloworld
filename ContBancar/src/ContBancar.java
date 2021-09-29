public class ContBancar {

    private double _sold = 0.0;

    public ContBancar(double _sold)
    {
        this._sold = _sold;
    }

    public void depozitareSuma(double suma)
    {
        this._sold = this._sold + suma;
    }

    public boolean retragereSuma(double suma)
    {
        if(_sold < suma) return false;
            else {
            this._sold = this._sold - suma;
            return true;
            }
    }
    public double getSold() {
        return _sold;
    }

    public void setSold(double _sold) {
        this._sold = _sold;
    }
}
