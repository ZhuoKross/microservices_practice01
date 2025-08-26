package com.microservice.host.Services;

import com.microservice.host.Entity.Host;
import com.microservice.host.Repository.HostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostService {

    private HostRepository hostRepository;

    public HostService(HostRepository hostRepository){
        this.hostRepository = hostRepository;
    }

    public List<Host> getAllHosts (){
        return hostRepository.findAll();
    }

    public Host createHost(Host host){
        return hostRepository.save(host);
    }

    public Host updateHost(Long idHost, Host host){
        Host hostToUpdate = hostRepository.findById(idHost).orElse(null);

        hostToUpdate.isRegularHost = host.isRegularHost;
        hostToUpdate.isVipHost = host.isVipHost;
        hostToUpdate.price = host.price;
        hostToUpdate.document = host.document;
        hostToUpdate.name = host.name;

        return hostRepository.save(hostToUpdate);
    }
}
