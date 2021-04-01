package modularizacao.utils.operacao;

import modularizacao.utils.operacao.Internal.DivHelper;
import modularizacao.utils.operacao.Internal.MultiHelper;
import modularizacao.utils.operacao.Internal.SubHelper;
import modularizacao.utils.operacao.Internal.SumHelper;

public class Calculadora {

    private final SumHelper sumHelper;
    private final SubHelper subHelper;
    private final DivHelper divHelper;
    private final MultiHelper multiHelper;

    public Calculadora() {
        this.sumHelper = new SumHelper();
        this.subHelper = new SubHelper();
        this.divHelper = new DivHelper();
        this.multiHelper = new MultiHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }

    public int multi(int a, int b) {
        return multiHelper.execute(a, b);
    }

}
