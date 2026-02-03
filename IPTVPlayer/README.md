# IPTV Player

Um aplicativo Android nativo para reproduzir canais IPTV a partir de arquivos M3U.

## 📋 Características

- ✅ Suporte para arquivos M3U
- ✅ Lista dinâmica de canais com RecyclerView
- ✅ Reprodução de vídeo em streaming
- ✅ Interface limpa e intuitiva
- ✅ Desenvolvido em Kotlin
- ✅ Arquitetura MVVM com ViewModel

## 🛠️ Requisitos

- Android Studio (Bumblebee ou superior)
- SDK Android 24 (API 24) ou superior
- Gradle 7.2 ou superior
- Kotlin 1.7.10

## 📦 Instalação

### 1. Clonar o repositório

```bash
git clone <seu-repositorio>
cd IPTVPlayer
```

### 2. Build do projeto

```bash
./gradlew build
```

### 3. Instalar no dispositivo/emulador

```bash
./gradlew installDebug
```

## 🚀 Como Usar

1. Abra o aplicativo
2. Importe um arquivo M3U com os canais IPTV
3. Selecione um canal para começar a reproduzir
4. Use os controles de reprodução para navegar

## 📁 Estrutura do Projeto

```
IPTVPlayer/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/seunome/iptvplayer/
│   │   │   │   ├── MainActivity.kt          # Activity principal com lista de canais
│   │   │   │   ├── PlayerActivity.kt        # Activity do player de vídeo
│   │   │   │   ├── ChannelAdapter.kt        # Adapter para RecyclerView
│   │   │   │   ├── ChannelViewModel.kt      # ViewModel para gerenciar dados
│   │   │   │   ├── Channel.kt               # Modelo de dados do canal
│   │   │   │   └── M3UParser.kt             # Parser de arquivos M3U
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml    # Layout principal
│   │   │   │   │   ├── activity_player.xml  # Layout do player
│   │   │   │   │   └── item_channel.xml     # Layout de item do canal
│   │   │   │   └── values/
│   │   │   │       └── strings.xml          # Strings da aplicação
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle
├── gradle/
├── build.gradle                             # Build script root
├── settings.gradle                          # Configuração do projeto
├── .gitignore
└── README.md
```

## 🏗️ Arquitetura

O projeto utiliza a arquitetura MVVM (Model-View-ViewModel):

- **Model**: `Channel.kt` - Classe de dados que representa um canal IPTV
- **View**: `MainActivity.kt`, `PlayerActivity.kt` - Activities que exibem a interface
- **ViewModel**: `ChannelViewModel.kt` - Gerencia os dados e lógica de negócio
- **Adapter**: `ChannelAdapter.kt` - Conecta os dados à RecyclerView

## 📝 Dependências Principais

- **AndroidX**: Componentes modernos do Android
- **Lifecycle**: ViewModels e LiveData para gerenciamento de ciclo de vida
- **RecyclerView**: Para exibir listas eficientes
- **Kotlin Coroutines**: Para operações assíncronas (pronto para adicionar)

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob licença MIT. Veja o arquivo LICENSE para mais detalhes.

## 👨‍💻 Autor

Seu Nome - [GitHub](https://github.com/Faguiro)

## 📞 Suporte

Para dúvidas ou problemas, abra uma issue no repositório.

---

**Última atualização**: Fevereiro de 2026
