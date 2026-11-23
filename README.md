# Dispositivos Móveis com Kotlin ✨

> Repositório de exercícios e projetos desenvolvidos na disciplina de Dispositivos Móveis, do curso de Análise e Desenvolvimento de Sistemas (IFSP – Campus Araraquara).

## Descrição

Este repositório registra minha evolução na disciplina: dos primeiros exercícios de ambientação com a linguagem Kotlin no IntelliJ, assimilando as semelhanças com Java, até aplicativos Android com listagem, cadastro e persistência de dados em banco local.

## 📂 Conteúdo do repositório

| Data | Entrega | Assunto |
|------|---------|---------|
| Ago/2026 | Exercícios iniciais + aula 2 | Primeiro contato com Kotlin no IntelliJ |
| Ago/2026 | Exercícios condicionais | Estruturas condicionais e validação de entradas |
| Set/2026 | **Conversor de moedas (pt 1 e pt 2)** (avaliativo) | Exercício prático de conversão entre moedas |
| Set/2026 | App Catálogo de Cursos | App Android com ListView exibindo cursos do IFSP |
| Nov/2026 | **Catálogo de Cursos + Persistência de Dados** (avaliativo) | Banco de dados local |

---

### 1. Exercícios iniciais de Kotlin 🤔

Exercícios simples para ambientação à linguagem:

1. Ler uma palavra do usuário e exibi-la em maiúsculas e em minúsculas.
2. Pedir dois números inteiros e mostrar a soma deles.
3. Ler um número inteiro e mostrar se ele é par ou ímpar, tratando entradas inválidas com `toIntOrNull()`.
4. Solicitar três notas (decimais) e calcular a média, exibindo se o aluno está aprovado (média ≥ 6), em recuperação (entre 4 e 5.9) ou reprovado (média < 4).
5. Ler um valor em graus Celsius e perguntar se o usuário quer converter para Fahrenheit ou Kelvin.

### 2. App Catálogo de Cursos 📱

Aplicativo Android que lista cursos do IFSP em uma `ListView`. Ao tocar em um curso, um `Toast` exibe a descrição dele.

### 3. Catálogo de Cursos + Persistência de Dados 💾 *(exercício avaliativo)*

Evolução do catálogo: os cursos deixaram de ficar fixos na memória e passaram a ser salvos em um **banco de dados local (SQLite) usando a biblioteca Room**. Assim, os dados continuam salvos mesmo depois que o app é fechado.

**Funcionalidades:**
- **Listagem (`getAll`)**: os cursos são carregados do banco ao abrir o app.
- **Inserção (`insert`)**: nova tela de cadastro com nome e descrição do curso.
- Na primeira execução, o banco é populado com os cursos padrão (TSI, Engenharia Mecânica, ADS e Licenciatura em Matemática).

## 🛠️ Tecnologias utilizadas
- Kotlin
- IntelliJ IDEA
- Android Studio
- ViewBinding e ListView
- Room (SQLite)
- Kotlin Coroutines

## 📈 Status
> Em andamento: a cada aula, novos conceitos de desenvolvimento mobile são incorporados aos projetos.

## Aprendizados e Desafios
1. Encarar as semelhanças e diferenças entre Kotlin e Java.
2. Pesquisar, inferir e aplicar funcionalidades novas.
3. Ambientar-me ao IntelliJ e ao Android Studio.
4. Entender o ciclo de vida das Activities e a comunicação entre telas.
5. Aplicar persistência de dados e o conceito de fonte única de verdade (*Single Source of Truth*) com o Room.
6. Usar corrotinas para executar tarefas pesadas sem travar a interface.

## Licença
Este código está licenciado sob a GPLv3 (GNU General Public License v3).

---

## 👩🏻‍🦰 Sobre mim
> Sou Lauane Santana, estudante de Análise e Desenvolvimento de Sistemas, com foco em alinhar os conhecimentos adquiridos na faculdade à Cibersegurança e Cloud.

### 📬 Contato
- [Meu LinkedIn](https://linkedin.com/in/lauanesantana)
