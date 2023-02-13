package tobyspring.config;

import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.StreamSupport;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    private final ClassLoader classLoader;

    public MyAutoConfigImportSelector(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> autoConfig = new ArrayList<>();
//        Iterable<String> candidates = ImportCandidates.load(MyAutoConfiguration.class, classLoader);
//        //Iterable Type -> Array
//        return StreamSupport.stream(candidates.spliterator(), false).toArray(String[]::new);
//        for (String candidates : ImportCandidates.load(MyAutoConfiguration.class, classLoader) ) {
//            autoConfig.add(candidates);
//        }
        ImportCandidates.load(MyAutoConfiguration.class,classLoader).forEach(candidate-> autoConfig.add(candidate));
//        //파라미터를 하나의 메소드에만 사용하므로, 전환가능
//        ImportCandidates.load(MyAutoConfiguration.class,classLoader).forEach(autoConfig::add);

        //String List -> Array
        return autoConfig.stream().toArray(String[]::new); //stream 활용
//      Arrays.copyOf(autoConfig.toArray(), autoConfig.size(), String[].class);
//      autoConfig.toArray(new String[0]);
    }
}
