import javax.faces.bean.ManagedBean;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by andrepapazoglu on 25/05/15.
 */
@ManagedBean
public class ConversorMonetario {
    private String de;
    private String para;
    private Double valor;

    private Double resultado;

    private Map<String, Double> taxas = new LinkedHashMap<String, Double>();

    public ConversorMonetario() {
        this.taxas.put("Real", 1.0);
        this.taxas.put("Euro", 2.33);
        this.taxas.put("Peso Argentino", 0.42);
        this.taxas.put("Dolar Americano", 1.84);

    }

    public void converter() {
        this.resultado = this.valor * this.taxas.get(this.de) / this.taxas.get(this.para);
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Map<String, Double> getTaxas() {
        return taxas;
    }

    public void setTaxas(Map<String, Double> taxas) {
        this.taxas = taxas;
    }
}
