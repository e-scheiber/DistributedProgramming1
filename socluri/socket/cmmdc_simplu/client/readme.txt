javac -d mods -Xlint src/*.java

java --module-path mods -m client/cmmdc.socket.client.CmmdcClient

java --module-path mods -m client/cmmdc.socket.client.ClientFXCmmdc

java --module-path mods -m client/cmmdc.socket.client.VisualCmmdcClient




