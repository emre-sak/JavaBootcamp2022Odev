package overriding;
public class OgrenciKrediManager extends BaseKrediManager{
    //BaseKrediManager'in hesapla metodunu OgrenciKrediManager için ezdik.
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }

}
