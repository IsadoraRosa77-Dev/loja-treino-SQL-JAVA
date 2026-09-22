/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lojasql;

/**
 *
 * @author eduar
 */
public class LojaSQL {


    public static void main(String[] args) {

        // =========================
        // CRIAR PRODUTOS NOVOS
        // =========================

        Produtos p1 = new Produtos("Computer- Gamer", 900.99, 2);
        Produtos p2 = new Produtos("Airpods-Apple", 250.00, 20);

        // Adicionar os produtos à base de dados
        p1.adicionarProduto();
        p2.adicionarProduto();

        // Mostrar os produtos
        System.out.println("\n--- PRODUTOS INICIAIS ---");
        p1.listarProdutos();


        // =========================
        // NOVA COMPRA / REPOSIÇÃO
        // =========================

        System.out.println("\n--- NOVA COMPRA ---");

        // Adicionar 5 ao produto com ID 1
        p1.adicionarStock(1, 5);

        // Adicionar 10  ao produto com ID 2
        p2.adicionarStock(2, 10);


        // Mostrar o stock depois da compra
        System.out.println("\n--- STOCK APOS NOVA COMPRA ---");
        p1.listarProdutos();


        // =========================
        // FAZER UMA VENDA
        // =========================

        System.out.println("\n--- VENDA ---");

        // Vender 3 do produto com ID 1
        p1.venderProduto(1, 3);
        p2.venderProduto(2, 2);


        // Mostrar o stock depois da venda
        System.out.println("\n--- STOCK APOS VENDA ---");
        p1.listarProdutos();
    }
}



