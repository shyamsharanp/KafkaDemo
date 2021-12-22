# KafkaDemo
 
shyamsharanprajapati@Shyamsharans-MacBook-Pro ~ % brew install kafka
==> Downloading https://ghcr.io/v2/homebrew/core/openjdk/manifests/ 17.0.1_1 ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/openjdk/blobs/ sha256:bcbefe19b5
==> Downloading from https://pkg-containers.githubusercontent.com/ ghcr1/blobs/sh ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/ca-certificates/ manifests/2021- ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/ca-certificates/ blobs/sha256:1b
==> Downloading from https://pkg-containers.githubusercontent.com/ ghcr1/blobs/sh ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/openssl/1.1/ manifests/1.1.1m ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/openssl/1.1/blobs/ sha256:bac056
==> Downloading from https://pkg-containers.githubusercontent.com/ ghcr1/blobs/sh ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/zookeeper/manifests/ 3.7.0_1 ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/zookeeper/blobs/ sha256:6345ff0c
==> Downloading from https://pkg-containers.githubusercontent.com/ ghcr1/blobs/sh ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/kafka/manifests/3.0.0 ###################################################################### ## 100.0%
==> Downloading https://ghcr.io/v2/homebrew/core/kafka/blobs/ sha256:5333488c250d
==> Downloading from https://pkg-containers.githubusercontent.com/ ghcr1/blobs/sh ###################################################################### ## 100.0%
 
==> Installing dependencies for kafka: openjdk, ca-certificates, openssl@1.1 and zookeeper
==> Installing kafka dependency: openjdk
==> Pouring openjdk--17.0.1_1.monterey.bottle.tar.gz
    /usr/local/Cellar/openjdk/17.0.1_1: 639 files, 305.2MB
==> Installing kafka dependency: ca-certificates
==> Pouring ca-certificates--2021-10-26.all.bottle.tar.gz
==> Regenerating CA certificate bundle from keychain, this may take a while...
    /usr/local/Cellar/ca-certificates/2021-10-26: 3 files, 208.5KB
==> Installing kafka dependency: openssl@1.1
==> Pouring openssl@1.1--1.1.1m.monterey.bottle.tar.gz
    /usr/local/Cellar/openssl@1.1/1.1.1m: 8,081 files, 18.5MB
==> Installing kafka dependency: zookeeper
==> Pouring zookeeper--3.7.0_1.monterey.bottle.tar.gz
    /usr/local/Cellar/zookeeper/3.7.0_1: 1,084 files, 42.4MB
==> Installing kafka
==> Pouring kafka--3.0.0.monterey.bottle.tar.gz ==> Caveats
To restart kafka after an upgrade:
  brew services restart kafka
Or, if you don't want/need a background service you can just run:
/usr/local/opt/kafka/bin/kafka-server-start /usr/local/etc/kafka/ server.properties
==> Summary
    /usr/local/Cellar/kafka/3.0.0: 197 files, 82.5MB
==> Running `brew cleanup kafka`...
Disable this behaviour by setting HOMEBREW_NO_INSTALL_CLEANUP. Hide these hints with HOMEBREW_NO_ENV_HINTS (see `man brew`). ==> Caveats
==> kafka
To restart kafka after an upgrade:
  brew services restart kafka
Or, if you don't want/need a background service you can just run:
  /usr/local/opt/kafka/bin/kafka-server-start /usr/local/etc/kafka/
server.properties
==================================
shyamsharanprajapati@Shyamsharans-MacBook-Pro ~ % export
KAFKA_VERSION=3.0.0
shyamsharanprajapati@Shyamsharans-MacBook-Pro ~ % export KAFKA_HOME=/
usr/local/Cellar/kafka/3.0.0/libexec
shyamsharanprajapati@Shyamsharans-MacBook-Pro ~ % export
      
KAFKA_CONF_DIR=/usr/local/etc/kafka
shyamsharanprajapati@Shyamsharans-MacBook-Pro ~ % export
PATH=$KAFKA_HOME/bin:$PATH
 

=====================

/usr/local/opt/kafka/bin/zookeeper-server-start /usr/local/etc/kafka/
zookeeper.properties
/usr/local/opt/kafka/bin/kafka-server-start /usr/local/etc/kafka/
server.properties
 