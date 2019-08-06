# dc19-eInnsyn
DifiCamp 2019 - utforskning av ny backend til eInnsyn

Innhold i github
1. OLD_PROJECT1\
  Denne mappen er bare et førsteutkast av dt som vi har endt opp med å gjøre i mappen "e-innsynv2".\
2. RDFtoJava\
  Denne mappen er vårt forsøk på å lese inn data fra datadumpen vi fikk fra eInnsyn inn i java klassene våre. Vi prøvde forskjellige           bibliotek som Pinto, rdf4j og Jena.\
3. cosmostest\
  Denne applikasjonen var eit forsøk på å snakke med Azure Cosmos DB, men fungerte ikkje.\
4. cosmostest9999\
  Forsøk på å snakke med Cosmos, fikk en del feilmeldinger med filen Microsoft.Azure.Documents.ServiceInterop.dll.\
5. e-innsyn-graf\
  Denne mappen inneholder REST API for å legge inn data i en grafdatabase. Her har vi oppretta strukturen til eInnsyn i java klasser og satt   dei som noder og relasjoner med nødvendige annotasjoner.\
6. e-innsynv2\
  Denne mappen inneholder REST API for å legge inn data til Azure SQL database. Det som også er gjort her, er å legge inn tilsvarende med       informasjon som vi fikk i dummyfilen, dette var fordi vi trodde det var oppgaven, så denne ble satt som ferdig etter at det ble avklart.\
7. mongo\
  mongo inneholder en applikasjon som for tilgang til dokumentbasert data gjennom hypermediabasert RESTful front end. Hvordan man setter opp applikasjonen er beskrevet i opplæringen under:\
  https://spring.io/guides/gs/accessing-mongodb-data-rest/ \
  Her kan man laste ned en fullstendig version av applikasjonen.\
  \
  MongoDB programmet må først lastes ned fra nettsiden: https://www.mongodb.com/download-center/community vanligvis MSI pakken. Du kan også laste ned MongoDB Compass for et mer visuelt fremstilling av databasen, selv om det anbefales å start databasen i kommandlinjen først, siden MongoDB Compass har gitt flere feil når det kommer til oppsettet av en database. For å opprett databasen i kommandlinjen må man først endra mappen til bin mappen i MongoDB programmet du lastet ned. Denne er vanligvis i programfiler under MongoDB mappen du laget da du lastet ned MongoDB (vanligvis: C:\Program Files\MongoDB\Server\4.0\bin). Derfra kjører du kommandoen:
  ```
  mongo
  ```
  Da linjen:
  ```
  Started MongoApplication in 8.138 seconds (JVM running for 21.789)
  ```
  kommer opp kan du åpne en ny kommandolinje med endre mappen til der applikasjonen er. Derfor kan du følge opplæringen først vis under dette punktet. \
  \
  Link til diverse mongoDB kommandoer:\
  https://docs.mongodb.com/manual/reference/mongo-shell/

8. neo4j_testing\
  Denne mappen inneholder et prosjekt der vi testa (hello world/spørringer) tilkobling mot neo4j før vi kobla opp e-innsyn-graf. 
