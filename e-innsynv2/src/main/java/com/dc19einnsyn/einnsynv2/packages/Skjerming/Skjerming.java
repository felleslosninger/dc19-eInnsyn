package com.dc19einnsyn.einnsynv2.packages.Skjerming;

import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Skjerming {

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "registrering_id")
        private Registrering registrering;

        @Id
        @GeneratedValue
        private Long skjermingId;

        private String tilgangsrestriksjon;
        private String skjermingshjemmel;
        private String skjermingMetadata;
        private String skjermingDokument;
        private String skjermingsvarighet;
        private String skjermingOpphoererData;

        public Skjerming(Registrering registrering, String tilgangsrestriksjon, String skjermingshjemmel, String skjermingMetadata, String skjermingDokument, String skjermingsvarighet, String skjermingOpphoererData) {
                this.registrering = registrering;
                this.tilgangsrestriksjon = tilgangsrestriksjon;
                this.skjermingshjemmel = skjermingshjemmel;
                this.skjermingMetadata = skjermingMetadata;
                this.skjermingDokument = skjermingDokument;
                this.skjermingsvarighet = skjermingsvarighet;
                this.skjermingOpphoererData = skjermingOpphoererData;
        }

        public Registrering getRegistrering() {
                return registrering;
        }

        public void setRegistrering(Registrering registrering) {
                this.registrering = registrering;
        }

        public Long getSkjermingId() {
                return skjermingId;
        }

        public void setSkjermingId(Long skjermingId) {
                this.skjermingId = skjermingId;
        }

        public String getTilgangsrestriksjon() {
                return tilgangsrestriksjon;
        }

        public void setTilgangsrestriksjon(String tilgangsrestriksjon) {
                this.tilgangsrestriksjon = tilgangsrestriksjon;
        }

        public String getSkjermingshjemmel() {
                return skjermingshjemmel;
        }

        public void setSkjermingshjemmel(String skjermingshjemmel) {
                this.skjermingshjemmel = skjermingshjemmel;
        }

        public String getSkjermingMetadata() {
                return skjermingMetadata;
        }

        public void setSkjermingMetadata(String skjermingMetadata) {
                this.skjermingMetadata = skjermingMetadata;
        }

        public String getSkjermingDokument() {
                return skjermingDokument;
        }

        public void setSkjermingDokument(String skjermingDokument) {
                this.skjermingDokument = skjermingDokument;
        }

        public String getSkjermingsvarighet() {
                return skjermingsvarighet;
        }

        public void setSkjermingsvarighet(String skjermingsvarighet) {
                this.skjermingsvarighet = skjermingsvarighet;
        }

        public String getSkjermingOpphoererData() {
                return skjermingOpphoererData;
        }

        public void setSkjermingOpphoererData(String skjermingOpphoererData) {
                this.skjermingOpphoererData = skjermingOpphoererData;
        }
}
