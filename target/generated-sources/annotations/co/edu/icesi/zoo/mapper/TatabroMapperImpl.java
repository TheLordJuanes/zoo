package co.edu.icesi.zoo.mapper;

import co.edu.icesi.zoo.dto.TatabroDTO;
import co.edu.icesi.zoo.dto.TatabroParentsDTO;
import co.edu.icesi.zoo.model.Tatabro;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-20T21:10:54-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
@Component
public class TatabroMapperImpl implements TatabroMapper {

    @Override
    public Tatabro fromDTO(TatabroDTO tatabroDTO) {
        if ( tatabroDTO == null ) {
            return null;
        }

        Tatabro.TatabroBuilder tatabro = Tatabro.builder();

        tatabro.id( tatabroDTO.getId() );
        tatabro.name( tatabroDTO.getName() );
        tatabro.sex( tatabroDTO.getSex() );
        tatabro.weight( tatabroDTO.getWeight() );
        tatabro.age( tatabroDTO.getAge() );
        tatabro.height( tatabroDTO.getHeight() );
        tatabro.arrivalDate( tatabroDTO.getArrivalDate() );
        tatabro.fatherID( tatabroDTO.getFatherID() );
        tatabro.motherID( tatabroDTO.getMotherID() );

        return tatabro.build();
    }

    @Override
    public TatabroDTO fromTatabro(Tatabro tatabro) {
        if ( tatabro == null ) {
            return null;
        }

        TatabroDTO tatabroDTO = new TatabroDTO();

        tatabroDTO.setId( tatabro.getId() );
        tatabroDTO.setName( tatabro.getName() );
        tatabroDTO.setSex( tatabro.getSex() );
        tatabroDTO.setWeight( tatabro.getWeight() );
        tatabroDTO.setAge( tatabro.getAge() );
        tatabroDTO.setHeight( tatabro.getHeight() );
        tatabroDTO.setArrivalDate( tatabro.getArrivalDate() );
        tatabroDTO.setFatherID( tatabro.getFatherID() );
        tatabroDTO.setMotherID( tatabro.getMotherID() );

        return tatabroDTO;
    }

    @Override
    public TatabroParentsDTO fromTatabroDTO(TatabroDTO child, TatabroDTO father, TatabroDTO mother) {
        if ( child == null && father == null && mother == null ) {
            return null;
        }

        TatabroParentsDTO tatabroParentsDTO = new TatabroParentsDTO();

        if ( child != null ) {
            tatabroParentsDTO.setId( child.getId() );
            tatabroParentsDTO.setName( child.getName() );
            tatabroParentsDTO.setSex( child.getSex() );
            tatabroParentsDTO.setWeight( child.getWeight() );
            tatabroParentsDTO.setHeight( child.getHeight() );
            tatabroParentsDTO.setAge( child.getAge() );
            tatabroParentsDTO.setArrivalDate( child.getArrivalDate() );
        }
        tatabroParentsDTO.setFather( father );
        tatabroParentsDTO.setMother( mother );

        return tatabroParentsDTO;
    }
}
