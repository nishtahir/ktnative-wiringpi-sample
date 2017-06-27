# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

   config.vm.box = "ubuntu/trusty64"

   config.vm.provider "virtualbox" do |vb|
     vb.memory = "2048"
   end

   config.vm.provision "shell", inline: <<-SHELL
    add-apt-repository ppa:openjdk-r/ppa
    apt-get update
    apt-get install openjdk-8-jdk
    update-alternatives --config java
    update-alternatives --config javac
   SHELL
end
