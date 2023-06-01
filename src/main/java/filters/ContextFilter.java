package filters;

import entities.Order;

/**
 *   Contexto que mantém os dados e resultados entre os filtros
 */
public class ContextFilter {

    /**
     * Verifica se o usuário está autenticado no contexto atual
     */
    private boolean authenticated;

    /**
     * Verifica se o pedido é válido no contexto atual
     */
    private boolean validated;
    private Order order;

    public ContextFilter() {}

    /**
     * Getters e setters básicos
     */

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

