<div align="center">

# 🔀 PSC · Lista 03 — Estruturas de Decisão

**Seis programas em Java aplicando condicionais, `switch`, expressões matemáticas e tratamento de casos inválidos.**

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Exercícios](https://img.shields.io/badge/exerc%C3%ADcios-6-7C3AED?style=flat-square)
![PSC](https://img.shields.io/badge/disciplina-PSC%202025-0EA5E9?style=flat-square)

</div>

---

## 📖 Sobre

Terceira lista da disciplina **PSC — Programação de Soluções Computacionais (2025)**, dedicada às **estruturas de decisão**: o programa deixa de ser linear e passa a escolher caminhos conforme os dados informados.

## 📚 Exercícios

| Arquivo | O que faz |
|:---|:---|
| `Numeros.java` | Lê três números e exibe o maior, o menor e a média aritmética |
| `Calculadora.java` | Calculadora com menu de operações `+ − × ÷ ^`, incluindo bloqueio de divisão por zero e símbolo inválido |
| `EquacaoSegundoGrau.java` | Resolve equação de 2º grau calculando o delta (`Δ = b² − 4ac`) e tratando todos os cenários |
| `CirculoEsfera.java` | Menu com três opções: perímetro do círculo, área do círculo e volume da esfera a partir do raio |
| `MaquinaVenda.java` | Simula uma máquina de venda: valida se o valor pago cobre a compra e calcula o troco em notas |
| `SorteioNumero.java` | Sorteia um número inteiro entre dois valores informados e diz se é par ou ímpar |

### 🧮 `EquacaoSegundoGrau` — cenários tratados

| Condição | Resultado |
|:---|:---|
| `a == 0 && b == 0 && c != 0` | *"Coeficientes informados incorretamente"* |
| `a == 0 && b != 0` | Equação de 1º grau — raiz única `-c / b` |
| `Δ < 0` | Não possui raízes reais |
| `Δ == 0` | Duas raízes reais iguais |
| `Δ > 0` | Duas raízes reais distintas |

### 💵 `MaquinaVenda` — decomposição do troco

O troco é convertido para centavos e decomposto de forma gulosa nas notas **R$ 50, 20, 10, 5, 2 e 1**, exibindo a quantidade de cada uma. Se o valor pago for insuficiente, a compra é recusada.

## 🧠 Conceitos aplicados

- `if` / `else if` / `else` e `switch` com `break`
- Operadores relacionais e lógicos (`&&`, `||`)
- `Math.pow`, `Math.sqrt` e `Math.random`
- Aritmética inteira para decomposição de valores (`/` e `%`)
- Validação de pré-condições antes de calcular
- `System.out.printf("%.2f%n")` para saída monetária

## ▶️ Como executar

```bash
git clone https://github.com/rafaellfsouza/psc-lista-03-2025.git
cd psc-lista-03-2025

javac Calculadora.java
java Calculadora
```

---

<div align="center">

<sub>Desenvolvido por <a href="https://github.com/rafaellfsouza"><b>Rafael Luiz Ferreira de Souza</b></a> · PSC 2025 · <code>Java</code> <code>Estruturas de Decisão</code></sub>

</div>
