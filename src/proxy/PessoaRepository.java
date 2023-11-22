package proxy;

import builder.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {
// Basicamente aqui vai simular o comportamento de um BD
    private Map<Long, Pessoa> banco = new HashMap<>();
    private static Long countId = 1L;

    public void save(Pessoa pessoa){
        banco.put(countId++, pessoa);
    }

    public Pessoa findById(Long id){
        try {
            Thread.sleep(3000); // Essa thread vai dormir por esse tempo
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }

}
