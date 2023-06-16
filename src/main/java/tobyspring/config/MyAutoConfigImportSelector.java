//package tobyspring.config;
//
//import org.springframework.boot.context.annotation.ImportCandidates;
//import org.springframework.context.annotation.DeferredImportSelector;
//import org.springframework.core.type.AnnotationMetadata;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MyAutoConfigImportSelector implements DeferredImportSelector {
//
//    private final ClassLoader classLoader;
//
//    public MyAutoConfigImportSelector(ClassLoader classLoader) {
//        this.classLoader = classLoader;
//    }
//
//    @Override
//    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
////        Iterable<String> candidates = ImportCandidates.load(MyAutoConfiguration.class, classLoader);
////        return StreamSupport.stream(candidates.spliterator(), false).toArray(String[]::new);
//        List<String> autoConfigs = new ArrayList<>();
//
////        for (String candidate :ImportCandidates.load(MyAutoConfiguration.class, classLoader) ) {
////            autoConfigs.add(candidate);
////        }
////        ImportCandidates.load(MyAutoConfigImportSelector.class, classLoader).forEach(candidate -> autoConfigs.add(candidate));
//        ImportCandidates.load(MyAutoConfiguration.class, classLoader).forEach(autoConfigs::add);
//
//        return autoConfigs.toArray(new String[0]);
////        return autoConfigs.stream().toArray(String[]::new);
////        return Arrays.copyOf(autoConfigs.toArray(), autoConfigs.size(), String[].class);
//
//
//    }
//
//}
