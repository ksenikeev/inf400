##

Группировка

static <T,K> Collector<T,?,Map<K,List<T>>>
groupingBy(Function<? super T,? extends K> classifier)

static <T,K,A,D> Collector<T,?,Map<K,D>>
groupingBy(Function<? super T,? extends K> classifier,
Collector<? super T,A,D> downstream)

static <T,K,D,A,M extends Map<K,D>> Collector<T,?,M>
groupingBy(Function<? super T,? extends K> classifier,
Supplier<M> mapFactory, Collector<? super T,A,D> downstream)


Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
.collect(groupingBy(BlogPost::getType));