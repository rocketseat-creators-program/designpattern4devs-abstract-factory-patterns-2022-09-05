package br.com.anabneri.apple.model.certificate;

public class USACertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "\t- Calibrating US rules";
    }
}
